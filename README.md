# Spring Training: Resources

## Contents

 - [Working Mode](#working-mode)
 - [Environment](#environment)
 - [Time Bookings](#time-bookings)
 - [Online Shop](#online-shop)
 - [Chapters](#chapters)
   * [1. Java, Git, Maven](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/100-java-maven.md)
   * [2. Spring Basics](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/200-spring-basics.md)
   * [3. Spring Boot](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/300-spring-boot.md)
   * [4. JPA and Flyway](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/400-jpa-and-flyway.md)
   * [5. JSON REST APIs](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/500-json-rest-apis.md)
   * [6. Strategy Design Pattern](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/600-strategy-design-pattern.md)
   * [7. Testing](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/800-testing.md)
   * [8. Security](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/opt-300-oauth.md)
   * [9. State Machine](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/900-state-machine.md)
   * [OPT-1. Java Mail](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/opt-700-java-mail.md)
   * [OPT-2. WebSocket](https://github.com/msg-CareerPaths/spring-training/blob/career-start-2023/chapters/opt-800-websocket.md)

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
 - You need to install [Postman](https://www.getpostman.com/apps), [IntelliJ IDEA (Community)](https://www.jetbrains.com/idea/download/#section=windows), SonarLint and Lombok [plugins for IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html#install_plugin_from_repo). Note: the newer versions of Intellij already have the Lombok installed. Please check it before trying to install it.
 - You will also need [PostgreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads).
 - Install also [pgAdmin](https://www.sqlshack.com/an-overview-of-pgadmin-postgresql-management-tool/) on your computer which will provide you a way to query and manage your database.
 - If Maven or anything else does not work because of SSL errors, ask the mentors or coordinators for the Zscaler setup guide (you may need to follow _3.2.1 Java section_, _3.2.3 Intellij_ and _3.3 Git_ from this guide).

## Time Bookings

Use the following booking codes to track activities:

| Booking Code                            | Activity                                                                                                          |
|-----------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Schul. & Einarb. JAVA - allg. Einarb.   | Going through the learning material; tutorials; doing own theoretical investigations; attending presentations.    |
| Schul. & Einarb. JAVA - Impl.-Phase     | Online shop implementation.                                                                                       |
| Schul. & Einarb. JAVA - Komm und JF     | Regular calls, internal discussions (on-boarding, off-boarding).                                                  |

In the booking description, please use the following format: `Chapter: Brief activity description`, for the regular calls, simply state the name of the meeting. 

Examples: `1: Reading about dependency injection, spring basics`, `2: Setting up the project.`.

## Online Shop
The application will deal with the management and daily functioning of a small online shop. Business processes:
 - **Order creation**: an end customer places an order to buy several products (based on the availability of the products in the stock).
 - **Stock management**: the existing product stocks are updated automatically based on the orders placed by customers.
 - **Shop analytics**: the management must be able to view the evolution of the daily revenue for each individual location of the shop.

Throughout the application, we assume that prices are always in EUR and weights are always in KG. 

![Data Model](./diagrams/careerStart-data-model.svg "Data Model")
