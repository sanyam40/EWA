/* 

• JDBC is a common database programming API that can access any kind of tabular data 
(i.e., data stored in Relational Databases)
• It is often referred as “Java Database Connectivity”,however it is not an acronym (It is just an API).
• With the help of JDBC API we can Create, Update, Delete and Execute (CRUD) records.


--- JDBC Architecture ---

• The JDBC API supports 2 tier and 3 tier architecture models for accessing the relational databases.
• In tier-2 model, java application directly communicates with the database. 


--- JDBC Components ---

• The JDBC API includes the following components
I. DriverManager: This  class  manages  the  JDBC  drivers. It  manages  the connection established between the
   underlying java application and the relational database. The DriverManager class is responsible for managing JDBC Drivers.
II. Connection: It is an interface that contain all the methods for establishing a connection  with  the  database.
    All  communication  with  the  database  will  go through Connection interface.
III. Statement: This interface contain methods to execute queries with the database
IV. ResultSet: The object of ResultSet class holds the data that is retrieved from the Statement interface. 
It acts as an iterator that points to the first row of the table.
V. SQL Exceptions: This class handles exceptions generated while interacting with the database


-- Following 6 steps are involved for establishing a database connection: --

1) Importing the necessary packages: Import the sql package
2) Register the JDBC driver class: using forName() method of the Class class
3) Open a Connection: using getConnection() method of the DriverManager class
4) Create a Statement: using createStatement() method of the Statement interface
5) Execute a Query: using executeQuery() method of the Statement interface which returns an object of ResultSet class
6) Clean up the Environment: using close() method of the Connection interface  

--- COMMANDS FOR DATABASE CONNECTION ---

1) Register the JDBC driver class
• Class.forName(“com.mysql.cj.jdbc.Driver”); //mysql driver
2) Open a database connection
• Connection con = DriverManager.getConnection(URL,”Username”,”Password”);
3) Create a Statement
•Statement stmt = con.createStatement();
4) Execute SQL Query
•String query = “Select id, first, last, age FROM Employees”;
•ResultSet rs = stmt.executeQuery(query);
5) Process the Result
While(rs.next()) {
int id = rs.getInt(“id”);
String first = rs.getString(“first”);
String last = rs.getString(“last”);
int age = rs.getInt(“age”);}
6)Clean up the environment
rs.close(); | stmt.close(); | con.close();

--- JDBC Drivers ---

• DriverManager class is responsible for establishing a connection between the java application and the relational database.
• It keeps a track of the available drivers and establishes a connection between the database and the appropriate driver.

• Syntax:
   • <protocol>:<subprotocol>:<subname>
   • Protocol: Protocol used to access database (jdbc here)
   • Subprotocol: Identifies the database driver
• Subname: Name of the resource
• The name and location of the database will be given as a URL
• The details of the URL may vary depending upon the type of database being used

• E.g. : jdbc:mysql://localhost:3306/DB_Name     -> MySQL
- jdbc -> API NAME 
- Mysql -> DATABASE
- localhost -> SERVER NAME
- 3306 -> PORT NO
- DB_NAME -> DATABASE NAME

--- Statements ---

• Three types of statements each reflecting a specific SQL statements:
1) Statement: Represents simple SQL statements to the database, without parameters.
2) PreparedStatement: Represents precompiled SQL statements to execute them multiple times efficiently.
3) CallableStatement: Used to execute stored procedures.

A) execute() -- BOOLEAN IS RETURN TYPE
  - SELECT
  - INSERT 
  - UPDATE
  - DELETE
  - CREATE
B) executeQuery() -- RESULTSET IS RETURN TYPE
  - SELECT
C) executeUpdate() -- NO. OF AFFECTED ROWS ( 0 FOR CREATE )    
  - INSERT
  - UPDATE
  - DELETE
  - CREATE

-- 1) STATMENT --
• Statement can be used multiple times for sending a query.
• It should be released when it is no longer required.
  • Statement.close()
  • It releases the JDBC resources immediately instead of waiting for the statement to close automatically via garbage collection. 
  
-- 2) PREPARED STATMENT --
• PreparedStatement are used for queries that are executed for many times.
• They are parsed (compiled) by the Database only once and stored in a PreparedStatement object.
• This object can be used to efficiently execute a query multiple times.
• Column values can be set after compilation using question mark (‘?’).
• Therefore, PreparedStatement can be thought of as statements that contains placeholders to be substituted later with actual values.

-- ResultSet --
• The ResultSet interface (under java.sql package) represents a result set of the database table
• The object of the ResultSet class maintains a cursor pointing to the row of the table
• The data can be accessed by an index (starting position 1) or by an attribute name
• When the executeQuery() method returns the ResultSet object, the cursor is placed before the first row of the data
• To move the cursor to the first row of data next() method is invoked on the ResultSet object
• If the next row has data, the next() results true else it returns false and the cursor moves beyond the end of the data.

• Accessing a ResultSet
• Typical cursor operations are:
first(), last(), previous(), next() etc.
• Typical code:
While(rs.next())
{
// process the 
row;
}
• Accessing a ResultSet (Contd...)
• The ResultSet class contains many methods for accessing the value of a 
column of the current row
• It can use the column name or its position in the table
• E.g. to retrieve the value in the “Name” column having 2nd position in 
the table
rs.getString(“Name”); //Column Name
rs.getString(2); // Column position
rs.getFloat(“Price”); // Retrieving floating point 
value
rs.getInt(4);  // Retrieving integer values from 
column 4.

-- META DATA --
 
• The metadata means data about data i.e., we can get the information about the data stored in the database (or tables).
• Two kinds of meta data in JDBC
1) Database Metadata: To look up information about the database. 
2) ResultSet Metadata: To get the structure of data that is returned.
• E.g. No. of columns, Column type
• Metadata shows the schema information

1)DatabaseMetaData interface is useful to get the meta data of a database as it provides database name, driver name and version from the Connection object
• E.g. connection.getMetaData().getDatabaseProductName()
connection.getMetaData().getDatabaseProductVersion()

2)ResultSetMetadata interface is useful to get the meta data of a table as it provides getMetaData() method to get meta data from the ResultSet object
• E.g. ResultSetMetaData md = rs.getMetaData();
int numCols = md.getColumnCount();
For(int i = 0; i <= numCols; i++) {
if(md.getColumnType(i) == Types.CHAR)
System.out.println(md.getColumnName(i));
}

-- Transaction Management --
• Transaction is a process of performing a series of database operations as a single unit or work with all or nothing criteria.
• A transaction management system follows the ACID properties to ensure that every transaction goes well.
• JDBC supports transactions and contains methods and functionalities to implement transaction-based applications.

*/