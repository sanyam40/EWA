
 
• Java Server Pages (JSP) is a server-side technology that is used for developing dynamic & platform independent web applications.
• It is an extension to Java Servlets as it provides more functionality like expression language, custom tags, JSTL etc. 
• Web pages created using JSP are easier to maintain than a Servlet because we can eparate designing and development.
• Everything a Servlet can do, a JSP can also do (easily).

--- Advantages of JSP over Servlets --- 

1) It provides an easier way to code dynamic web pages.
2) JSP pages can be directly accessed, web.xml mapping is not required like in Servlets.
3) Any change in the JSP code is handled by the Web Container (e.g. Tomcat) and doesn’t require any recompilation or redevelopment.
4) Web pages developed in JSP are opposite of Servlets as a servlet adds HTML code inside the Java code, while JSP adds Java code inside HTML using scriptlets (special tags).

• JSP pages are converted into Servlet by the Web Container.
• The Container translates a JSP page into servlet class.
• Finally the class is compiled and loaded (instantiation, initialization & processing).

--- Lifecycle of JSP ---

• The lifecycle of JSP follows the following steps:
I. Translation of JSP page into servlet code.
II. Compilation of the servlet code.
III. Loading the compiled servlet class.
IV. Creating servlet instance (instantiation).
V. Initialization by calling jspInit(). 
VI. Request processing by calling _jspService().
VII.Destroying the servlet instance by calling jspDestroy().

• Web Container translates JSP page into a servlet(.java) file and compiles it into a servlet class.
• The servlet class file (bytecode) is loaded into the container using classloader.
• Object of the generated servlet is created (Instantiation) & initialized (jspInit()).
• The initialized servlet can now request for any service (_jspService()).
• After completion, the container calls jspDestroy() to perform clean up tasks Lifecycle of JSP.

--- Scripting Elements ---

• A JSP page looks similar to a HTML page, except that a JSP page also has Java code in it.
• We will create a simple JSP page by putting scriptlet tags (<% ... %>) inside a HTML code.
• The code inside <% .. %> tags is processed by the JSP engine during the process of translation of JSP into servlet code.
• Any other text inside the JSP page (except the scripting element) is considered as HTML code.
• Without the scripting element, everything is considered as a plain HTML code. 

•There are five types of scripting elements:-
1) Comment  -- <%-- comment --%>
2) Directive -- <%@ directive %>
3) Declaration -- <%! declarations %>
4) Scriptlet -- <% scriptlets %>
5) Expression -- <%= expression %>

-- Comments Tag : 

• Comment tag is used to put in general comments about what you are doing.
• JSP comments are only visible in the JSP page and are not included in the servlet code during translation.
• Syntax: <%--  java source code --%> 

-- Scriptlet tag : 

• This tag allows us to write java code inside a HTML page.
• It contain statements & variables declarations that are valid in the java language.
• It implements the _jspService() method. 
• Syntax <%  java source code %>

-- Declaration tag : 

• The JSP declaration tag is used to declare static members, instance variables and methods inside this tag.
• The code written inside the JSP declaration tag is placed outside the _jspService() method of the converted servlet.
• Syntax <%!  field or method declaration %>

-- Directive tag : 

• This tag gives special instruction to the Web Container at the time of JSP page translation into Servlet class.
• It is generally written as the first statement of the JSP page.
• Directive tags are of three types:
i) <%@ page ... %> :: Defines page dependent properties such as language, session, errorPage etc.
ii) <%@ include ... %> :: Defines file to be included
iii) <%@ taglib ... %> :: Declares tag library used in the page

-- Include Directive tag : 
• The include directive tells the web container to copy everything in the included file and paste it into the current JSP file.

-- Page directive tag :
• The page directive tag defines attributes that are applied to an entire JSP page.

-- Taglib Directive tag :
• It is used to define tag library that the current JSP page uses.
• We use the TLD (Tag Library Descriptor) file to define the tags.

--- Implicit Objects ---

1) JSP gives access to some implicit objects which represent some commonly used objects for servlets that JSP developers might need to use.
2) There are a total of 9 implicit objects that are created by the web container and made them available to all JSP pages.
3) The developer can call these objects directly without declaring them explicitly. These objects are also called as pre-defined variables.
4) The available implicit objects are out, request, config, zession, application, page etc.

-- Following tables lists the 9 implicit objects supported by JSP :

1) request : The HttpServletRequest object is associated with the request.
2) response : The HttpServletResponse object is associated with the response that is sent back to the browser (client).
3) out : The JspWriter/PrintWriter object is associated with the output stream of the response.
4) session : The HttpSession object is associated with the session for the given user request.
5) application : The ServletContext object for the web application.
6) config : The ServletConfig object associated with the servlet for the current JSP page.
7) pageContext : The PageContext object that encapsulates the environment of a single request for this current JSP page.
8) page : The page variable is equivalent to this variable of Java language.
9) exception : It represents the Throwable object that was thrown by some other JSP page.

--- Action Elements ---

• The JSP specification provides Action Elements (or tags) that follows XML syntax to control the behavior of a servlet engine.
• These tags are used to remove or eliminate the use of scriptlet code since it is too java centric and cannot be used by front end developers.
• Using these action elements, you can dynamically insert a file, forward the user to another page or generate a HTML for the java plugin.
• Standard action tags are also called predefined functions and begins with the jsp: prefix.
• Syntax : <jsp:action_name attribute = “value” />

-- The following table shows some of the standard Action elements available : 

1) jsp:include : Includes a file in runtime when the page is requested.
2) jsp:forward : Forwards the request and response to a new page.
3) jsp:plugin : Generates browser specific code that makes an object or embed another component such as applet.
4) jsp:element : Defines XML elements dynamically.
5) jsp:attribute : Defines dynamically defined XML elements attribute .
6) jsp:body : Used within standard or custom tags to supply the tag body.
7) jsp:text : Used to write template text in JSP pages and documents.

-- jsp:forward action tag ::
• Syntax : <jsp:forward page = “relativeURL | <%= expression %>” /

-- jsp:include action tag ::
• Used to include the content of another resource like a JSP page, HTML or Servlet
• It includes the resource at runtime (or request time) so it is better for dynamic pages
• Syntax : <jsp:include page=“relativeURL | <%= expression %>” />

--- Expression Language ---

• The Expression Language (EL) is a new feature that was added to JSP 2.0 specification.
• Its main purpose is to produce scriptless JSP pages and to simplify the accessibility of data stored in objects like request, session, application etc.
• Syntax of an EL is as follows : ${ expression } 
• Expression is a valid EL expression that can be mixed with static text/values and can also be combined with other expressions to form a larger expression.

-- How EL expression is used? : 
• As attribute values in the standard (action) & custom tags :: <jsp:include page=“${location}”>
• To output in HTML tag :: <h1> Welcome ${name} </h1>

--- JSTL ---

• The JSP Standard Tag Library (JSTL) is a standard library that contain useful JSP tags which encapsulates the core functionality & simplifies the JSP web application development.
• JSTL provides support for many functionalities such as iteration in conditional statements, tags for manipulating XML documents, SQL tags and internationalization tags.
• It also provides a framework for integrating the existing custom tags with the JSTL tags. 

• Advantages of using JSTL :: 
1. Rapid Development: The JST Library provides many tags that simplifies the application development process.
2. Code Reusability: JSTL tags can be used on various pages.
3. Removes scriptlet code: Avoids the use of scriptlet tags by providing ready to use, already implemented common functionalities.

 
