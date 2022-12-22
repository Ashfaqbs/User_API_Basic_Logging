# User_API_Basic_Logging
This is a Spring boot project , having user restfull API's , with multiple relationships i.e one to many, and one to one , this project is used to demonstrate the basic logging of a springboot project

Step 1 :
To configure logging in your Spring Boot application, you can use the application.properties or application.yml file in the src/main/resources directory.
For example, you can add the following properties to the application.properties file to configure the logging level and output destination:

logging.level.root=INFO
logging.file=app.log

This will set the logging level to INFO and output the logs to a file named app.log.

You can also use a logging framework like log4j, logback, or java.util.logging to customize the logging in your Spring Boot application. To use a logging framework, 
you will need to include the dependency in your project and configure the logging settings in the application.properties or application.yml file.


Step 2 :
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

