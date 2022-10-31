### 7. Testing

Goal: Perform tests of the following types: unit tests, integration tests and API tests.

Required Reading:

- [Spring Boot Testing](https://www.baeldung.com/spring-boot-testing)
- [Unit Testing with Spring Boot](https://reflectoring.io/unit-testing-spring-boot/)
- [Writing Tests in Postman](https://blog.getpostman.com/2017/10/25/writing-tests-in-postman/)

Online Shop:

> Implement unit tests for the following functionalities:
>
> - CSV serialization and de-serialization,
> - Location strategies.
>
> Create a `test` Spring profile which uses an in-memory H2 database instance.
>
> Implement integration tests which use this profile and thus use the in-memory database for the following functionalities:
>
> - Create a new order successfully,
> - Fail to create a new order due to missing stock.
>
> Create a `@RestController` enabled just in the `test` profile, which exposes an API for clearing / populating the in-memory database.
>
> Implement Postman API tests which use the above-mentioned endpoint to set-up / tear-down the tests, for the following functionalities:
>
> - Create a new order successfully,
> - Export the stocks,
> - Fail to create a new order due to missing stock,
> - Fail to create a new order due to unknown product ID(s).

Further Resources:

- [Self-Contained Testing Using an In-Memory Database](https://www.baeldung.com/spring-jpa-test-in-memory-database)
- [Test Pyramid](https://martinfowler.com/bliki/TestPyramid.html)
- [Spring Boot Testing Reference](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/boot-features-testing.html)
- [Postman Scripts Reference](https://learning.getpostman.com/docs/postman/scripts/intro_to_scripts)
