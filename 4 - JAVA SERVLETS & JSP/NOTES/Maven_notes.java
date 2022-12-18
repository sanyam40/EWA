/* 
• JEE is a platform-independent, Java-centric environment from Oracle for developing, building and deploying Web-based enterprise applications
• The Java EE platform provides an API and runtime environment for developing and running large scale, multi-tiered and secure network applications
• Java EE web components are either servlets or web pages created using Java Server Pages technology (JSP pages)
• Java Servlet and Java Server Pages (JSP) technology components are web components that run on the server side
• A Java EE application is packaged into one or more standard units for deployment to any Java EE platform-compliant system.

--- Apache Maven ---
• Maven is a powerful build automation and project management tool used with Java projects.
1) Maven is centered around the concept of POM file (stands for Project Object Model).
2) A POM file is an XML representation of project resources like source code, dependencies (external JARs), test code etc.
3) While executing a task or goal, Maven looks for the POM in the current directory and checks the configuration information, dependencies etc. and then executes the goal.
4) This file represents the very basic and fundamental unit in Maven.

-- POM -- 
•A pom.xml will always start with the root element denoted as <project> under which all the other configurations will be made.
•Before defining a pom.xml file, you should define a set of elements which are known as maven co-ordinates.
•groupId: unique for any project in an organization.
•artifactId: defines the name of any project.
•version: used to derive the version of any project and classify the versions when any major changes/implementations are carried during the development phase.

•Super POM
•The Super POM is Maven’s default POM which is extended by all POMs (despite explicitly defined or not)
•It basically defines a set of default configurations which is shared and used by all the maven projects.
•The super pom.xml is not required to be written by the developers as it will come as default with the maven installation.
•It helps developers to specify minimum configuration details in their pom.xml.

-- Maven Repositories -- 
•A Maven repository refers to a directory of packaged JAR files (project jars, library jar), plugins and any other specific artefacts that are configured as part of any project.
•Maven searches for all the dependencies in a repository which is classified into 3 main categories as shown below :-
1)Local Repository (local system)
2)Central Repository (maven’s central repository)
3)Remote Repository (mvnrepository)

-- Maven searches for the repository in the 
following order : LOCAL REPOSITORY => CENTRAL REPOSITORY => REMOTE REPOSITORY
•In case if the dependency is not found in any of the repository, Maven will stop the processing and throws an error.

1) Local Repository -- 
•The local repository resides in your local system which is cached from the remote/central repository downloads and ready for the usage.
•This repository keeps all the dependencies (library JARs, plugin JARs etc.) of a project and gets created when you run any maven command for the first time.
•The local repository by default gets created by Maven in USER_HOME directory.
•It helps to avoid references to dependencies stored on a remote machine every time you build a project.

2) Central Repository --
•This is the repository provided by the Apache Maven community and contains a large number of commonly used libraries.
•In case if Maven does not find any dependency in local repository, it starts searching in central repository located at  https://repo1.maven.org/maven2/ .
•No configuration is required for accessing a central repository.

3) Remote Repository  --
•This repository is located in the remote server and can be accessed by using different file transfer protocols like file:// or http:// .
•Lots of libraries can be missing from the central repository such as JBoss etc. which makes it necessary to define remote repository in pom.xml file.

--- How Maven looks for dependencies --- 
•First Maven searches for the dependencies in the local repositories and if found, it continues with the further execution.
•If the dependencies are not found in the local repositories then it will look into the central repositories and download them into the local repository for future reference and usage.
•In case, if the dependencies not found in central repository, then it starts scanning into the remote repositories. If it is not found there, Maven will throw an exception which says “not able to find the dependencies” and stops processing.

--- Build Life Cycle ---
•A build life cycle is the well defined sequence of steps in order to execute the tasks and goals of any Maven project.
•Maven comes with 3 built-in build life cycle phases as shown below:
1)Clean: this phase involves cleaning of the project (for fresh build & deployment)
2)Default: handles the complete deployment of the project
3)Site: generates the java documentation of the project

1)Clean phase
•This phase is used to clean up the project and make it ready for compilation and deployment
•The command used for cleaning up the project is mvn post-clean
•When this command is executed, maven executes certain important commands internally
mvn pre-clean
mvn clean
mvn post-clean

2)Default Phase
•This is the primary life cycle of Maven and is used to build the complete application
•This phase invokes certain commands that will be executed by maven
•The list of these commands can be found here  https://www.tutorialspoint.com/maven/maven_build_life_cycle.htm
•When a phase is executed using Maven command, (e.g. mvn compile), it will execute phases up to and including that phase will execute.

3)Site Lifecycle
•Maven site plugin is generally used to create fresh documentation to create reports, deploy site, etc. 
•It consists of the following phases
1)Pre-site
2)Site
3)Post-site
4)Site-deploy
•The command used in maven to generate javadocs for a given project is 'mvn site'.
*/