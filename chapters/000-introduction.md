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
- If Maven does not work because of SSL errors, [setup the Zscaler certificate in your trust store](https://team.msg.de/site/IT/Freigegebene%20Dokumente/Forms/AllItems.aspx?RootFolder=%2Fsite%2FIT%2FFreigegebene%20Dokumente%2FAnleitungen%2FZscaler&FolderCTID=0x012000581B900D5D91664C93095DB345EDAFC4&View=%7B8F4AC536%2DBC7A%2D4D89%2DA598%2D491A539B7BBE%7D).

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

![Data Model](https://github.com/msg-CareerPaths/spring-training/blob/master/diagrams/data-model.svg "Data Model")
