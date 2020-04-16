# Spring Training: Resources

## Contents

 - [Working Mode](#working-mode)
 - [Environment](#environment)
 - [Online Shop](#online-shop)
 - [Chapters](#chapters)
   * [0. Java, Git, Maven](#0-java-git-maven)
   * [1. Spring Basics](#1-spring-basics)
   * [2. Spring Boot](#2-spring-boot)
   * [3. JPA and Flyway](#3-jpa-and-flyway)
   * [4. JSON REST APIs](#4-json-rest-apis)
   * [5. Testing](#5-testing)
   * [6. Security](#6-security)
   * [OPT-1. Olingo](#opt-1-olingo)


## Working Mode

The road-map consists of several steps. In each step, a set of theoretical concepts are explored, supported by reference documentation, book chapters, tutorials and videos. In parallel, a simple application will be built with the learned concepts: the *Online Shop* application.

After the learning material for a given step was sufficiently explored, either some new functionality will be added to this application or old functionality will be refactored.

The application will have little-to-no user interface. Developers are expected to perform developer tests with Postman once the REST APIs are implemented.

All the code written must be published on GitHub. Commits must be pushed when each individual chapter is finished. In order to request a code review from the trainers, you must [open a pull request](https://help.github.com/en/articles/creating-a-pull-request) from the `develop` to the `master` branch.

For doing static code quality checks, two separate mechanisms will be used:
 - The plugin for SonarLint and the built-in code analysis must be used to fix code issues.
 - [Codacy](https://www.codacy.com/) will be enabled and developers should check the detected issues periodically. 

## Environment

You can work using your local environment:
 - You need to install [Postman](https://www.getpostman.com/apps), [IntelliJ IDEA (Community)](https://www.jetbrains.com/idea/download/#section=windows), SonarLint and Lombok [plugins for IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html#install_plugin_from_repo).

## Online Shop
The application will deal with the management and daily functioning of a small online shop. Business processes:
 - **Order creation**: an end customer places an order to buy several products (based on the availability of the products in the stock).
 - **Stock management**: the existing product stocks are updated automatically based on the orders placed by customers.
 - **Shop analytics**: the management must be able to view the evolution of the daily revenue for each individual location of the shop.

Throughout the application, we assume that prices are always in EUR and weights are always in KG. 

![Data Model](./diagrams/data-model.svg "Data Model")

## Chapters

### 0. Java, Git, Maven

Goal: Getting familiar with the ecosystem around Spring. You can skip this chapter if you have already worked with Java, Git and Maven before.

Required Reading:

 - [Git Basics](https://git-scm.com/book/en/v1/Getting-Started-Git-Basics)
 - [Maven Intro](https://maven.apache.org/what-is-maven.html)
 - [Java 8](https://www.tutorialspoint.com/java8/index.htm)
 - [EditorConfig](https://editorconfig.org/)

Online Shop: *nothing to do*.

Further Resources:

 - [GitHub - Hello World](https://guides.github.com/activities/hello-world/)
 - [Git - CLI Fundamentals](https://www.youtube.com/watch?v=HVsySz-h9r4)
 - [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
 - [Guide to Java Reflection](https://www.baeldung.com/java-reflection)

### 1. Spring Basics

Goal: Understand dependency injection and how it is realized with Spring.

Required Reading:

 - [What is Dependency Injection?](https://stackoverflow.com/a/130862/7612556)
 - [Spring - Core Annotations](https://www.baeldung.com/spring-core-annotations)
 - [Spring - Bean Annotations](https://www.baeldung.com/spring-bean-annotations)
 - [Spring - Constructor Injection](https://www.baeldung.com/constructor-injection-in-spring)

Online Shop: *nothing to do*.

Further Resources:

 - [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 1
 - [What is Spring all about?](https://www.youtube.com/watch?v=gq4S-ovWVlM)
 - [Spring Reference - Overview](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/overview.html#overview)
 - [Spring Reference - Core](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/core.html#spring-core) - Chapters 1 to 4

### 2. Spring Boot

Goal: Generate a new project and be able to use the out-of-the-box Spring Boot features.

Required Reading:

 - [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
 - [Configuration Properties](https://www.baeldung.com/configuration-properties-in-spring-boot)
 - [Introduction to Lombok](https://www.baeldung.com/intro-to-project-lombok)
 - [Introduction to H2 Database](http://www.topjavatutorial.com/misc/introduction-to-h2-database/)

Online Shop:
 
 > Register an account on GitHub and accept the training [GitHub Classroom Assignment](https://classroom.github.com/a/nnCheGru). This will create a new GitHub repository for you. Clone this repository locally and checkout the `develop` branch. During the course of the training, you will commit and push your work on this branch.
 >
 > Go to "Spring Initializr" and generate a new project:
 > - Group: `ro.msg.learning`,
 > - Artifact: `shop`,
 > - Dependencies: `Web`, `Security`, `JPA`, `Flyway`, `H2`, `Lombok`.
 >
 > Extract the generated `zip` file into the previously cloned repository. Import this project into your IDE. You can delete the `mvnw`, `mvnw.cmd` and `.mvn` files / folders as you have Maven in the IDE anyway.
 >
 > Enable the [H2 console for your application](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/boot-features-sql.html#boot-features-sql-h2-console) and configure H2 to use a [file-based storage somewhere on your computer](https://stackoverflow.com/questions/37903105/how-to-configure-spring-boot-to-use-file-based-h2-database/37969181#37969181).

Further Resources:
 - [Spring Boot Reference](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/index.html) - Parts I and II
 - [Spring Boot Tomcat Sample](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-tomcat)
 - [Common Application Properties](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/common-application-properties.html)
 - [Introduction to SLF4J](https://www.baeldung.com/slf4j-with-log4j2-logback)

### 3. JPA and Flyway

Goal: Initialize the database schema and map the tables to Java classes using JPA.

Required Reading:

 - [Database migrations with Flyway](https://www.baeldung.com/database-migrations-with-flyway)
 - [JPA - Entities](https://docs.oracle.com/javaee/5/tutorial/doc/bnbqa.html)
 - [JPA - JPQL](https://www.tutorialspoint.com/jpa/jpa_jpql.htm)
 - [Introduction to Spring Data JPA](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)

Online Shop:
 
 > Create a data model for your application in a Flyway SQL migration. You can refine the model by adding unique indexes (e.g. supplier name) and introducing artificial PKs instead of composite ones and also add a unique index.
 >
 > Translate this data model into Java entity classes. Use Lombok to annotate these classes with `@Data` annotations to generate getters, setters, equals and hashCode. Hint: *it might be useful to create a base entity class (containing just the primary key) or an interface (containing the primary key getter and setter) to be able to handle entities generically later on.*
 > 
 > Annotate all the entities with the proper JPA annotations (`@Entity`, `@OneToMany`, etc). Write Spring Data JPA repositories to allow easy access to your entities. 

Further Resources:
 - [Spring Data Reference](https://docs.spring.io/spring-data/jpa/docs/2.1.6.RELEASE/reference/html/)
 - [Spring Database Initialization](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/howto-database-initialization.html#howto-execute-flyway-database-migrations-on-startup)
 - [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 3.2

### 4. JSON REST APIs

Goal: Group business logic into service classes and expose this logic through REST interfaces.

Required Reading:

 - [What is REST?](https://medium.com/extend/what-is-rest-a-simple-explanation-for-beginners-part-1-introduction-b4a072f8740f) - Parts 1 and 2
 - [Spring REST Tutorial](https://spring.io/guides/tutorials/rest/)
 - [Spring Service Components](https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm)
 - [Strategy Design Pattern](https://en.wikipedia.org/wiki/Strategy_pattern)

Online Shop:
 > Create a simple API for exposing the products and product categories: 
 >
 > - Define a DTO (data transfer object) POJO which combines the properties from a product and its respective category. 
 > - Create a service class which uses the repositories in order to: create, update, delete, read by ID and read all the product (as DTO instances).
 > - Build a REST Controller which uses this service.
 >
 > Create a service class that handles the creation of orders. The following constraints apply:
 >
 > - You get a single java object as input. This object will contain the order timestamp, the delivery address and a list of products (product ID and quantity) contained in the order.
 > - You return an Order entity if the operation was successful. If not, you throw an exception.
 > - The service has to select a strategy for finding from which locations should the products be taken. The strategy should be selected based on a `@Configuration`. The following initial strategies should be created: 
 >   - **Single location** - find a single location that has all the required products (with the required quantities) in stock. If there are more such locations, simply take the first one based on the ID.
 >   - **Most abundant** - take each product from the location which has the largest stock for that particular product.
 > - The service then runs the strategy, obtaining a list of objects with the following structure: location, product, quantity (= how many items of the given product are taken from the given location). If the strategy is unable to find a suitable set of locations, it should throw an exception.
 > - The stocks are be updated by subtracting the shipped goods. 
 > - Afterwards the order is persisted in the database and returned.
 > 
 > Create a Rest Controller for the "Create order" operation, which should have a `POST` mapping accepting a JSON request body and producing a JSON response body.
 
Further Resources:

 - [RESTful API Designing Guidelines](https://hackernoon.com/restful-api-designing-guidelines-the-best-practices-60e1d954e7c9)
 - [DDD and Spring](http://static.olivergierke.de/lectures/ddd-and-spring/)
 - [Transaction Management](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/data-access.html#transaction)
 - [ConditionalOnProperty](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/api/org/springframework/boot/autoconfigure/condition/ConditionalOnProperty.html)
 - [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 2, Chapter 6

### 5. Testing

Goal: Perform tests of the following types: unit tests, integration tests and API tests.

Required Reading:

 - [Spring Boot Testing](https://www.baeldung.com/spring-boot-testing)
 - [Unit Testing with Spring Boot](https://reflectoring.io/unit-testing-spring-boot/)
 - [Writing Tests in Postman](https://blog.getpostman.com/2017/10/25/writing-tests-in-postman/)

Online Shop:

 > Implement unit tests for the Location strategies
 >
 >
 > Create a `test` Spring profile which uses an in-memory H2 database instance. 
 >
 > Implement integration tests which use this profile and thus use the in-memory database for the following functionalities:
 >
 > - Create a new order successfully,
 > - Fail to create a new order due to missing stock.
 >
 > Create a `@RestController` enabled just in the `test` profile, which exposes an API for clearing / populating the in-memory database.
 >
 > Implement Postman API tests which use the above-mentioned endpoint to set-up / tear-down the tests, for the following functionalities:
 >
 > - Create a new order successfully,
 > - Fail to create a new order due to missing stock,
 > - Fail to create a new order due to unknown product ID(s).

Further Resources:
 
 - [Self-Contained Testing Using an In-Memory Database](https://www.baeldung.com/spring-jpa-test-in-memory-database)
 - [Test Pyramid](https://martinfowler.com/bliki/TestPyramid.html)
 - [Spring Boot Testing Reference](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/boot-features-testing.html)
 - [Postman Scripts Reference](https://learning.getpostman.com/docs/postman/scripts/intro_to_scripts)

### 6. Security

Goal: Secure your application with HTTP Basic Authentication and Form Based Authentication.

Required Reading:

 - [Spring Security Hello World Guide](https://docs.spring.io/spring-security/site/docs/5.1.5.RELEASE/guides/html5/helloworld-boot.html)
 - [Spring Security Basic Authentication](https://www.baeldung.com/spring-security-basic-authentication)

Online Shop:

 > Implement a custom `UserDetailsService` which retrieves usernames and passwords from your database.
 >
 > Build two Spring configurations for securing your application: one with HTTP Basic and one with Form based login. These configurations should be active based on a Spring profile (e.g. `with-basic` and `with-form`) or based on a property such that only one of them is active at a time.
 >
 > Use Postman Tests to handle authentication.

Further Resources:

 - [Web Authentication Methods Explained](https://blog.risingstack.com/web-authentication-methods-explained/)
 - [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 4

### OPT-1. Olingo

Goal: expose a subset of the existing business logic via OData services.

Required Reading:

 - [Intro to OData](./documents/intro-to-odata.pdf)
 - [Olingo OData 2](https://olingo.apache.org/doc/odata2/index.html)
 - [OData v2 Examples](./examples/odata)

Online Shop:

 > Expose the following entities through a JPA-based OData service:
 >
 > - Order
 > - OrderDetails
 > - Product
 >
 > Use the [JPA-EDM XML mapping](https://olingo.apache.org/doc/odata2/tutorials/jparedefinemetadata.html) to exclude the unneeded JPA entities from the service, exclude any fields of type `LocalDate` or `LocalDateTime` and rename the entities and fields to conform to an UpperCamelCase naming convention.
 >
 > Create another separate OData service (with a separate Service Factory and separate Servlet) using the core processor. You will have to manually define a `EmdProvider` and a `ODataSingleProcessor` This service should expose the "create order" operation. 
 > 
 > Because for creating a new order, you must pass as an input a collection of products and quantities, you should use a *deep insert* OData operation. A deep insert is simply a regular *create* call with also passes the children entities).