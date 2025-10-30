## 4. JPA and Flyway

Goal: Initialize the database schema and map the tables to Java classes using JPA.

Required Reading:

- [Database migration using Flyway + Spring boot + Hibernate + SQL](https://www.youtube.com/watch?v=7uKynYx1eK0)
- [Database Initialization](https://docs.spring.io/spring-boot/docs/2.0.0.M6/reference/html/howto-database-initialization.html#:~:text=ddl-auto%20explicitly%20and%20the,none%20in%20all%20other%20cases)
- [JPA - Entities](https://docs.oracle.com/javaee/5/tutorial/doc/bnbqa.html)
- [JPA - JPQL](https://www.tutorialspoint.com/jpa/jpa_jpql.htm)
- [Introduction to Spring Data JPA](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)
- [Spring Boot Application with Flyway and PostgreSQL](https://dzone.com/articles/build-a-spring-boot-app-with-flyway-and-postgres)

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
> Translate this data model into Java entity classes. Use Lombok to annotate these classes with annotations to generate getters, setters, equals and hashCode. Hint: *it might be useful to create a base entity class (containing just the primary key) or an interface (containing the primary key getter and setter) to be able to handle entities generically if needed.*
>
> Annotate all the entities with the proper JPA annotations (`@Entity`, `@OneToMany`, etc.). Write Spring Data JPA repositories to allow easy access to your entities.

Further Resources:
- [Spring Data Reference](https://docs.spring.io/spring-data/jpa/docs/2.1.6.RELEASE/reference/html/)
- [Spring Database Initialization](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/howto-database-initialization.html#howto-execute-flyway-database-migrations-on-startup)
- [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 3.2
