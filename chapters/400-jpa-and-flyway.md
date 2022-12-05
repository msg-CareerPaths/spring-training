### 4. JPA and Flyway

Goal: Initialize the database schema and map the tables to Java classes using JPA.

Required Reading:

- [Database migrations with Flyway](https://www.baeldung.com/database-migrations-with-flyway)
- [JPA - Entities](https://docs.oracle.com/javaee/5/tutorial/doc/bnbqa.html)
- [JPA - JPQL](https://www.tutorialspoint.com/jpa/jpa_jpql.htm)
- [Introduction to Spring Data JPA](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)
- [Spring Boot Application with Flyway and PostgreSQL](https://dzone.com/articles/build-a-spring-boot-app-with-flyway-and-postgres)

Online Shop:

> Create a data model for your application in a Flyway SQL migration. You can refine the model by adding unique indexes (e.g. supplier name) and introducing artificial PKs instead of composite ones and also add a unique index.
>
> PostgreSQL has support to UUID, so you can use it instead of commonly used auto-increment integer. UUID is helpful to avoid a normal attack in which the hacker tries to increase or decrease an entity ID to discover new information. 
> 
> Translate this data model into Java entity classes. Use Lombok to annotate these classes with `@Data` annotations to generate getters, setters, equals and hashCode. Hint: *it might be useful to create a base entity class (containing just the primary key) or an interface (containing the primary key getter and setter) to be able to handle entities generically later on.*
>
> Annotate all the entities with the proper JPA annotations (`@Entity`, `@OneToMany`, etc). Write Spring Data JPA repositories to allow easy access to your entities.

Further Resources:
- [Spring Data Reference](https://docs.spring.io/spring-data/jpa/docs/2.1.6.RELEASE/reference/html/)
- [Spring Database Initialization](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/howto-database-initialization.html#howto-execute-flyway-database-migrations-on-startup)
- [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 1, Chapter 3.2
