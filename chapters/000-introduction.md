## Working Mode

The road-map consists of several steps. In each step, a set of theoretical concepts are explored, supported by reference documentation, book chapters, tutorials and videos. In parallel, a simple application will be built with the learned concepts: the *Online Shop* application.

After the learning material for a given step was sufficiently explored, either some new functionality will be added to this application or old functionality will be refactored.

Developers are expected to perform developer tests with Postman once the REST APIs are implemented. The application will have a user interface, once the Spring training is completed.

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
