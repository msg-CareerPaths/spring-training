### 3. Spring Boot

Goal: Generate a new project and be able to use the out-of-the-box Spring Boot features.

Required Reading:

- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Configuration Properties](https://www.baeldung.com/configuration-properties-in-spring-boot)
- [Introduction to Lombok](https://www.baeldung.com/intro-to-project-lombok)
- [Introduction to PostgreSQL with pgAdmin](https://www.youtube.com/watch?v=Dd2ej-QKrWY&ab_channel=Codemy.com)
- [PostgreSQL & pgAdmin Shorter Tutorial](https://www.youtube.com/watch?v=WFT5MaZN6g4)
- [Build a Spring Boot App With Flyway and Postgres](https://dzone.com/articles/build-a-spring-boot-app-with-flyway-and-postgres)

Online Shop:

> Register an account on GitHub with the msg email and create a new GitHub repository for Spring Training. Clone this repository locally and create a develop branch from the master branch before starting to work. During the course of the training, you will commit and push your work on this branch.
>
> Go to "Spring Initializr" and generate a new project:
> - Group: `ro.msg.learning`,
> - Artifact: `shop`,
> - Dependencies: `Web`, `JPA`, `Flyway`, `PostgreSQL Driver`, `Lombok`.
>
> Extract the generated `zip` file into the previously cloned repository. Import this project into your IDE. You can delete the `mvnw`, `mvnw.cmd` and `.mvn` files / folders as you have Maven in the IDE anyway.
>
> Running the application at this point, will result in an error due to missing postgreSQL database connection.
> 
> Setup in pgAdmin an `online-shop server` > then a `online-shop database` > and then a `online-shop schema`.
> 
> The `application.properties` file, inside the created Spring Boot application, should contain the database connection details. The `spring.jpa.hibernate.ddl-auto` should be set to `validate` as we are using Flyway.

Further Resources:
- [Spring Boot Reference](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/index.html) - Parts I and II
- [Spring Boot Tomcat Sample](https://github.com/oktadev/okta-spring-boot-tomcat-example)
- [Common Application Properties](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/common-application-properties.html)
- [Introduction to SLF4J](https://www.baeldung.com/slf4j-with-log4j2-logback)
