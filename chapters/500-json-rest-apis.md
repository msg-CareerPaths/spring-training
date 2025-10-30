## 5. JSON REST APIs

Goal: Group business logic into service classes and expose this logic through REST interfaces. Test the endpoints created with Postman.

Required Reading:

- [What is REST?](https://medium.com/extend/what-is-rest-a-simple-explanation-for-beginners-part-1-introduction-b4a072f8740f) - Parts 1 and 2
- [Spring REST Tutorial](https://spring.io/guides/tutorials/rest/)
- [Spring Service Components](https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm)
- [Spring Boot Annotations](https://medium.com/@davoud.badamchi/spring-boot-annotationsunderstanding-the-differences-and-usages-of-service-repository-f94e076bbcdc)
- [Data Transfer Objects](https://www.baeldung.com/java-dto-pattern)
- [Lombok Builder](https://www.baeldung.com/lombok-builder)
- [Postman API Testing](https://youtu.be/CLG0ha_a0q8)

Online Shop:
> Create a simple API for exposing the products and product categories:
>
> - Define a DTO (data transfer object) POJO which combines the properties from a product and its respective category.
> - Create a service class which uses the repositories in order to: create, update, delete, read by ID and read all the product (as model instances).
> - Create a mapper class which maps the model objects to the corresponding DTO objects and vice versa. For mapping consider using Lombok's `@Builder`.
> - Build a REST Controller which uses this service. Use the mapper class at Controller level to map the model objects returned by the service to the corresponding DTO instance (the service will return model instances and the API will return DTO instances).
>
> Create a service class that handles the creation of orders. The following constraints apply:
>
> - You get a single java object as input. This object will contain the order timestamp, the delivery address and a list of products (product ID and quantity) contained in the order.
> - You return an Order entity if the operation was successful. If not, you throw an exception.
> - The Service has to determine from which locations should the products be taken. For this Chapter the Service will find a **Single location** that has all the required products (with the required quantities) in stock. If there are more such locations, simply take the first one based on the ID.
> - The stocks need to be updated by subtracting the shipped goods.
> - Afterwards the order is persisted in the database and returned.
>
> Create a REST Controller for the "Create order" operation, which should have a `POST` mapping accepting a JSON request body and producing a JSON response body.
>
> The project should respect the following structure:
> ```
> src/main/java
>  └── ro.msg.learning
>       └── shop
>             ├── config/                # Configuration files (e.g., WebSecurityConfig)
>             ├── controller/            # REST Controllers
>             ├── service/               # Service layer (business logic)
>             ├── repository/            # Repositories (that call DB to extract data)
>             ├── model/                 # Entity classes (mapped to database tables)
>             ├── dto/                   # Data Transfer Objects (for API communication)
>             ├── mapper/                # Mappers (mapping DTOs <-> models)
>             ├── exception/             # Custom exceptions and handlers
>             ├── util/                  # Utility classes (e.g., validators, helpers)
>             └── ShopApplication.java 
>```
> *Important: Mapping should be handled in the controllers. Services should work exclusively with model classes, not DTOs. DTOs should not be used within the service layer.*


Further Resources:

- [RESTful API Designing Guidelines](https://hackernoon.com/restful-api-designing-guidelines-the-best-practices-60e1d954e7c9)
- [DDD and Spring](https://www.baeldung.com/hexagonal-architecture-ddd-spring)
- [Transaction Management](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/data-access.html#transaction)
- [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 2, Chapter 6
