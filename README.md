## Requirements
For building and running application:

* JDK 1.8
* Maven

## Clone


# Running the application

From your terminal;

<code>
mvn clean install<br>
java -jar flight-management-0.0.1-SNAPSHOT.jar
</code>


Swagger url:
http://localhost:5555/swagger-ui.html#/

Operations: 

--adding Airline Company <br>
<code>curl -X POST "http://localhost:5555/api/airline" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"companyName\": \"THY\", \"created\": \"2020-06-14T23:47:41.923Z\", \"updated\": \"2020-06-14T23:47:41.923Z\"}"</code>

--
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)

### Guides
The following guides illustrate how to use some features concretely:

* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

