## 4. JPA and Flyway

Goal: Initialize the database schema and map the tables to Java classes using JPA.

Required Reading:

- [Database migration using Flyway + Spring Boot + Hibernate + SQL](https://www.youtube.com/watch?v=7uKynYx1eK0)
- [Database initialization](https://docs.spring.io/spring-boot/docs/3.3.0-M2/reference/html/howto.html#howto.data-initialization)
- [Jakarta Persistence (JPA)](https://jakarta.ee/learn/docs/jakartaee-tutorial/current/persist/persistence-intro/persistence-intro.html)
- [JPA - JPQL](https://docs.jboss.org/hibernate/orm/6.4/userguide/html_single/Hibernate_User_Guide.html)
- [Introduction to Spring Data JPA](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)
- [Spring Boot Application with Flyway and PostgreSQL](https://blog.jetbrains.com/idea/2024/11/how-to-use-flyway-for-database-migrations-in-spring-boot-applications/)

Online Shop:

> Running the application at this point will result in an error due to missing PostgreSQL database connection.
> 
> Setup in pgAdmin an `online-shop server` > then an `online-shop database` > and then an `online-shop schema`.
> 
> The `application.properties` file, inside the created Spring Boot application, should contain the database connection details. The `spring.jpa.hibernate.ddl-auto` should be set to `validate` as we are using Flyway.
>
> After the database connection details were set correctly, the application should start.
>
> Create a data model for your application in a Flyway SQL migration. You should use as a guideline the database diagram provided.
>
> PostgreSQL has support for UUID data type, so you can use it instead of commonly used auto-increment integer. UUID is helpful to avoid a normal attack in which the hacker tries to increase or decrease an entity ID to discover new information. 
> 
> Translate this data model into Java entity classes. Use Lombok to annotate these classes to generate getters, setters, or other required functions.
> Hint: *it might be useful to create a base entity class (containing just the primary key) or an interface (containing the primary key getter and setter) to be able to handle entities generically if needed.*
>
> Annotate all the entities with the proper JPA annotations (`@Entity`, `@OneToMany`, etc.). Write Spring Data JPA repositories to allow easy access to your entities.

Further Resources:
- [Spring Data Reference](https://docs.spring.io/spring-data/jpa/reference/jpa.html)
- [Spring Database Initialization](https://docs.spring.io/spring-boot/how-to/data-initialization.html#howto.data-initialization.migration-tool.flyway)
- [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 3.2
