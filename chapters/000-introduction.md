## 0. Introduction

### Description

The road-map consists of several steps. In each step, a set of theoretical concepts are explored, supported by reference documentation, book chapters, tutorials and videos. In parallel, a simple application will be built with the learned concepts: the *Online Shop* application.

After the learning material for a given step was sufficiently explored, either some new functionality will be added to this application or old functionality will be refactored.

The application will have little-to-no user interface. Developers are expected to perform developer tests with Postman once the REST APIs are implemented.

### Working Mode

All code written must be published on GitHub.

- Create a new GitHub repository for the Spring Training. Clone this repository locally.
- **Before starting work**, [create](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-and-deleting-branches-within-your-repository) a `develop` branch from the `main` branch.
- Implement the online-shop requirements from that chapter. Commit messages should be suggestive of the changes made.
- **In order to request a code review from the mentors**, you must [open a pull request](https://help.github.com/en/articles/creating-a-pull-request) (PR) from the `develop` to the `main` branch. Notify the mentors about the PR.
- **Once the Pull Request is approved** by the mentors, merge it into the `main` branch.
- Ensure your local `main` branch is up-to-date by pulling the latest changes (git pull).
- Create a new branch from `main` or continue your work on the `develop` branch. Open a Pull Request when you want to request another code review and merge it into `main` after it is approved.
- Repeat as necessary until the training has ended.

### Environment Setup

You need to install:
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=windows)
- [Postman](https://www.getpostman.com/apps)
- SonarQube for IDE and Lombok [plugins for IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html#install_plugin_from_repo). **Note**: the newer versions of IntelliJ already have Lombok installed. Please check this before trying to install it.
- [PostgreSQL](https://www.postgresql.org/download/) for the database
    - Preferably, install [Docker Desktop on Windows](https://docs.docker.com/desktop/install/windows-install/) and start a [Postgres database container](https://www.docker.com/blog/how-to-use-the-postgres-docker-official-image/) with Docker Compose.
    - **Do not forget your username and password**
- [pgAdmin](https://www.sqlshack.com/an-overview-of-pgadmin-postgresql-management-tool/) which will provide you a way to query and manage your database.

For doing static code quality checks, two separate mechanisms can be used:
- SonarQube for IDE and the built-in code analysis must be used to fix code issues.
- [Codacy](https://www.codacy.com/) _(optional)_

### Online Shop

The application will deal with the management and daily functioning of a small online shop. Business processes:
 - **Order creation**: an end customer places an order to buy several products (based on the availability of the products in the stock).
 - **Stock management**: the existing product stocks are updated automatically based on the orders placed by customers.

Throughout the application, we assume that prices are always in euros (EUR) and weights are always in kilograms (KG).

![Data Model](https://raw.githubusercontent.com/msg-CareerPaths/spring-training/bootcamp-2025/diagrams/data-model.svg "Data Model")

### Timeline

This timeline is just for guidance, take time to understand the concepts before moving on.

- **Week 1**: Chapter 1, Chapter 2, Chapter 3, Chapter 4, **Open a Pull Request**
- **Week 2**: Chapter 5, (possibly) Chapter 6 **Open a Pull Request**
- **Week 3**: Chapter 6 (if not finished), Chapter 7 **Open a Pull Request**
- **Week 4**: Chapter 8 **Open a Pull Request**, **Prepare for Demo**

### Notes

- If you find any link broken, **please** inform your mentors to provide you with an alternative.
- Try to speed up the videos to *1.5x/2x* if you find them too slow.

### ZScaler Issues (optional - only when needed)

You might encounter ZScaler issues due to company policies. ZScaler is a proxy that scans and routes the internet traffic of your device, sometimes blocking you from accesing certain internet endpoints.
Thus, if you encounter **SSL certificate errors** (e.g., `UNABLE TO GET LOCAL ISSUER CERTIFICATE`) or simply **connection issues**, this may indicate a ZScaler problem.

First steps:
- Download the certificate offered by the company.
- Save the certificate in `C:\zscaler.crt`.

#### IntelliJ Issues
- Go to `File → Settings` in your IDE.
- Search for `Proxy` in the search bar.
    - Turn on `Auto-detect proxy settings`.
- Now search for `Server Certificates`.
    - Press the `+` icon in the `Accepted Certificates` section and add the ZScaler certificate.

#### Git Issues
- Go to `C:\Users\<your_username>\AppData\Local\Programs\Git\mingw64\ssl\certs` and open `ca-bundle.crt` in Notepad.
- Open `zscaler.crt` in a parallel Notepad instance.
- **Copy** the content from `zscaler.crt` to the bottom of the `ca-bundle.crt` file (leave an empty space after the previous certificate).
- You can make `Git` trust the Windows certificate store by running the following command in a terminal instance: `git config --global http.sslBackend schannel`.

####  Java Issues
- Copy `zscaler.crt` to the same directory where the `cacerts` file is located, e.g., `C:\Program Files\Java\jdk-21.0.9\lib\security`.
- Run Command Prompt as administrator and change directory to the `cacerts` folder.
- Run `keytool -keystore cacerts -importcert -alias zscaler_root_ca -file zscaler.crt`.
- Insert default password `changeit` and confirm.
- Check with `keytool -list -alias zscaler_root_ca -keystore cacerts` if the certificate has been added successfully.

