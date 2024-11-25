# Spring Training: Resources

## Contents
 - [Description](#description)
 - [Working Mode](#working-mode)
 - [Environment](#environment)
 - [Online Shop](#online-shop)
 - [Chapters](#chapters)
   * [1. Java, Git, Maven](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/100-java-maven.md)
   * [2. Spring Basics](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/200-spring-basics.md)
   * [3. Spring Boot](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/300-spring-boot.md)
   * [4. JPA and Flyway](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/400-jpa-and-flyway.md)
   * [5. JSON REST APIs](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/500-json-rest-apis.md)
   * [6. Strategy Design Pattern](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/600-strategy-design-pattern.md)
   * [7. Testing](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/800-testing.md)
   * [8. Security](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/opt-300-oauth.md)
   * [OPT-1. State Machine](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/900-state-machine.md)
   * [OPT-2. Java Mail](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/opt-700-java-mail.md)
   * [OPT-3. WebSocket](https://github.com/msg-CareerPaths/spring-training/tree/practica-de-iarna-2024/chapters/opt-800-websocket.md)

## Description

The road-map consists of several steps. In each step, a set of theoretical concepts are explored, supported by reference documentation, book chapters, tutorials and videos. In parallel, a simple application will be built with the learned concepts: the *Online Shop* application.

After the learning material for a given step was sufficiently explored, either some new functionality will be added to this application or old functionality will be refactored.

Developers are expected to perform developer tests with Postman once the REST APIs are implemented. The application will have a user interface, once the Spring training is completed.

## Working Mode

All code written must be published on GitHub.

- You will be provided with a repository in the GitHub organization. Ensure you have access to it.
- **Before starting work**, [create](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-and-deleting-branches-within-your-repository) a `feature branch` from the `main` branch. Use a descriptive name for the branch (e.g., feature/chapter-4-jpa-and-flyway).
- Implement the online-shop requirements from that chapter in your `feature branch`. Commits must be pushed when each individual chapter is finished.
- **In order to request a code review from the mentors**, you must [open a pull request](https://help.github.com/en/articles/creating-a-pull-request) from the `feature branch` to the `main` branch. Notify the mentors about the PR.
- **Once the Pull Request is approved** by the mentors, merge it into the `main` branch.
- Ensure your local `main` branch is up-to-date by pulling the latest changes (git pull).
- For the next chapter, repeat the process by creating a new `feature branch` from the updated `main` branch.
- Keep repeating this process until the training is completed.

For doing static code quality checks, two separate mechanisms will be used:
 - The plugin for SonarLint and the built-in code analysis must be used to fix code issues.
 - [Codacy](https://www.codacy.com/) will be enabled and developers should check the detected issues periodically. 

## Environment

You can work using your local environment:
 - You need to install [Postman](https://www.getpostman.com/apps), [IntelliJ IDEA (Community)](https://www.jetbrains.com/idea/download/#section=windows), SonarLint and Lombok [plugins for IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html#install_plugin_from_repo). Note: the newer versions of Intellij already have the Lombok installed. Please check it before trying to install it.
 - You will also need [PostgreSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads).
 - Install also [pgAdmin](https://www.sqlshack.com/an-overview-of-pgadmin-postgresql-management-tool/) on your computer which will provide you a way to query and manage your database.

## Online Shop
The application will deal with the management and daily functioning of a small online shop. Business processes:
 - **Order creation**: an end customer places an order to buy several products (based on the availability of the products in the stock).
 - **Stock management**: the existing product stocks are updated automatically based on the orders placed by customers.

Throughout the application, we assume that prices are always in EUR and weights are always in KG. 

![Data Model](./diagrams/careerStart-data-model.svg "Data Model")

## Timeline

This timeline is just for guidance, take time to understand the concepts before moving on.

- **Week 1**: Chapter 1, Chapter 2, Chapter 3, Chapter 4, **Open a Pull Request**
- **Week 2**: Chapter 5, (possibly) Chapter 6 **Open a Pull Request**
- **Week 3**: Chapter 6 (if not finished), Chapter 7 **Open a Pull Request**
- **Week 4**: Chapter 8 **Open a Pull Request**, **Prepare for Demo**
