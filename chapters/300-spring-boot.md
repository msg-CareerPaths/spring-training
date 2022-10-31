### 3. Spring Boot

Goal: Generate a new project and be able to use the out-of-the-box Spring Boot features.

Required Reading:

- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Configuration Properties](https://www.baeldung.com/configuration-properties-in-spring-boot)
- [Introduction to Lombok](https://www.baeldung.com/intro-to-project-lombok)
- [Introduction to H2 Database](http://www.topjavatutorial.com/misc/introduction-to-h2-database/)

Online Shop:

> Register an account on GitHub and accept the training [GitHub Classroom Assignment](https://classroom.github.com/a/qiaU7uWM). This will create a new GitHub repository for you. Clone this repository locally and create a develop branch from the master branch before starting work. During the course of the training, you will commit and push your work on this branch.
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
- [Spring Boot Tomcat Sample](https://github.com/oktadev/okta-spring-boot-tomcat-example)
- [Common Application Properties](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/common-application-properties.html)
- [Introduction to SLF4J](https://www.baeldung.com/slf4j-with-log4j2-logback)