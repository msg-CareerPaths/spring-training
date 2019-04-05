# Spring Training: Resources

## Working Mode

The road-map consists of several steps. In each step, a set of theoretical concepts are explored, supported by reference documentation, book chapters, tutorials and videos. In parallel, a simple application will be built with the learned concepts: the *Online Shop* application.

After the learning material for a given step was sufficiently explored, either some new functionality will be added to this application or old functionality will be refactored.

The application will have little-to-no user interface. Developers are expected to:
 - Write tests to cover the implemented logic.
 - Test the REST interfaces manually with Postman.

All the code written must be published on GitHub. Commits must be pushed when each individual chapter is finished.

For doing static code quality checks, two separate mechanisms will be used:
 - The plugin for SonarLint and the built-in code analysis must be used to fix code issues.
 - [Codacy](https://www.codacy.com/) will be enabled and developers should check the detected issues periodically. 

## Environment

You can work using your local environment:
 - You need to install [Postman](https://www.getpostman.com/apps), [IntelliJ IDEA (Community)](https://www.jetbrains.com/idea/download/#section=windows), SonarLint and Lombok [plugins for IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html#install_plugin_from_repo).
 - If maven does not work because of SSL errors, [setup the Zscaler certificate in your trust store](https://team.msg.de/site/IT/Freigegebene+Dokumente/Forms/AllItems.aspx?RootFolder=%2fsite%2fIT%2fFreigegebene%20Dokumente%2fAnleitungen%2fZscaler&FolderCTID=0x012000581B900D5D91664C93095DB345EDAFC4).

## Time Booking

Use the following booking codes to track activities:

| Booking Code                            | Activity                                                                                                          |
|-----------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Schul. & Einarb. JAVA - allg. Einarb.   | Going through the learning material; tutorials; doing own theoretical investigations; attending presentations.    |
| Schul. & Einarb. JAVA - Impl.-Phase     | Online shop implementation.                                                                                       |
| Schul. & Einarb. JAVA - Komm und JF     | Regular calls, internal discussions (on-boarding, off-boarding).                                                  |

In the booking description, please use the following format: `Chapter: Brief activity description`, for the regular calls, simply state the name of the meeting. 

Examples: `1: Reading about dependency injection, spring basics`, `2: Setting up the project.`.

## Online Shop
The application will deal with the management and daily functioning of a small shop. Business processes:
 - **Order creation**: an end customer places an order to buy several products (based on the availability of the products in the stock).
 - **Stock management**: the existing product stocks are updated automatically based on the orders placed by customers.
 - **Shop analytics**: the management must be able to view the evolution of the daily revenue for each individual location of the shop.

Throughout the application, we assume that prices are always in EUR and weights are always in KG. 

![Data Model](./diagrams/data-model.svg "Data Model")

## Chapters

### 0. Java, Git, Maven

Required Reading:

 - [Git Basics](https://git-scm.com/book/en/v1/Getting-Started-Git-Basics)
 - [Maven Intro](https://maven.apache.org/what-is-maven.html)
 - [Java 8](https://www.tutorialspoint.com/java8/index.htm)
 - [EditorConfig](https://editorconfig.org/)

Further Reading:

 - [GitHub - Hello World](https://guides.github.com/activities/hello-world/)
 - [Git - CLI Fundamentals](https://www.youtube.com/watch?v=HVsySz-h9r4)
 - [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

### 1. Spring Basics

**Required reading**

 - []()


### 2. Spring Boot

### 3. JPA and Flyway

### 4. Spring MVC

### 5. Security

### 6. REST Template

### 7. Task Scheduler

### OPT-1. JDBC

### OPT-2. MongoDB

### OPT-3. OAuth

### OPT-4. Olingo

### OPT-5. Thymeleaf

### OPT-6. RabbitMQ

### OPT-7. Web Reactive

### OPT-8. Java Mail

### OPT-9. Cloud