# What is Logging and why.
Logging is the process of recording messages, events, or other information about a software application or system. Logging is often used to help troubleshoot problems, monitor the health and performance of an application, and track the activities of an application.

## In a Spring Boot project, logging is typically configured using the logback library. Spring Boot provides several convenient features for configuring and managing logging in a project, including the ability to specify the log level, the format of log messages, and the location of log files.

There are several reasons why logging is important in a Spring Boot project:

Logging can help you understand what is happening inside your application, including any errors or exceptions that may occur.

Logging can help you identify performance issues or bottlenecks in your application.

Logging can help you track the activity of your application, including the input and output of various components.

Logging can help you identify security issues or suspicious activity in your application.

Logging can help you troubleshoot problems in production environments, where it may not be possible to debug the application directly.

Overall, adding logging to a Spring Boot project can help you understand and manage the behavior of your application, and can make it easier to identify and fix problems.







# How
# User_API_Basic_Logging
This is a Spring boot project , having user restfull API's , with multiple relationships i.e one to many, and one to one , this project is used to demonstrate the basic logging of a springboot project

## Step 1 :
To configure logging in your Spring Boot application, you can use the application.properties or application.yml file in the src/main/resources directory.
For example, you can add the following properties to the application.properties file to configure the logging level and output destination:

logging.level.root=INFO
logging.file=app.log

This will set the logging level to INFO and output the logs to a file named app.log.

You can also use a logging framework like log4j, logback, or java.util.logging to customize the logging in your Spring Boot application. To use a logging framework, 
you will need to include the dependency in your project and configure the logging settings in the application.properties or application.yml file.


## Step 2 :
using of logging , in any @Component Class


             import org.apache.commons.logging.Log;
             import org.apache.commons.logging.LogFactory;

              @Service
           public class MyService {
    
             private static final Log log = LogFactory.getLog(MyService.class);
    
             public void doSomething() {
              log.info("Doing something");
                   // ...
             }
            }

