### 5. JSON REST APIs

Goal: Group business logic into service classes and expose this logic through REST interfaces.

Required Reading:

- [What is REST?](https://medium.com/extend/what-is-rest-a-simple-explanation-for-beginners-part-1-introduction-b4a072f8740f) - Parts 1 and 2
- [Spring REST Tutorial](https://spring.io/guides/tutorials/rest/)
- [Spring Service Components](https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm)
- [Strategy Design Pattern](https://en.wikipedia.org/wiki/Strategy_pattern)
- [Data Transfer Objects](https://www.baeldung.com/java-dto-pattern)

Online Shop:
> Create a simple API for exposing the products and product categories:
>
> - Define a DTO (data transfer object) POJO which combines the properties from a product and its respective category.
> - Create a service class which uses the repositories in order to: create, update, delete, read by ID and read all the product (as DTO instances).
> - Build a REST Controller which uses this service.
>
> Create a service class that handles the creation of orders. The following constraints apply:
>
> - You get a single java object as input. This object will contain the order timestamp, the delivery address and a list of products (product ID and quantity) contained in the order.
> - You return an Order entity if the operation was successful. If not, you throw an exception.
> - The service has to select a strategy for finding from which locations should the products be taken. The strategy should be selected based on a `@Configuration`. The following initial strategies should be created:
    >   - **Single location** - find a single location that has all the required products (with the required quantities) in stock. If there are more such locations, simply take the first one based on the ID.
>   - **Most abundant** - take each product from the location which has the largest stock for that particular product.
> - The service then runs the strategy, obtaining a list of objects with the following structure: location, product, quantity (= how many items of the given product are taken from the given location). If the strategy is unable to find a suitable set of locations, it should throw an exception.
> - The stocks are be updated by subtracting the shipped goods.
> - Afterwards the order is persisted in the database and returned.
>
> Create a Rest Controller for the "Create order" operation, which should have a `POST` mapping accepting a JSON request body and producing a JSON response body.

Further Resources:

- [RESTful API Designing Guidelines](https://hackernoon.com/restful-api-designing-guidelines-the-best-practices-60e1d954e7c9)
- [DDD and Spring](https://www.baeldung.com/hexagonal-architecture-ddd-spring)
- [Transaction Management](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/data-access.html#transaction)
- [ConditionalOnProperty](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/api/org/springframework/boot/autoconfigure/condition/ConditionalOnProperty.html)
- [Spring in Action](https://1drv.ms/b/s!AiBPL7npTofshY5PJim4M5RiiOyu7w) - Part 2, Chapter 6
- [Strategy Design Pattern](https://www.youtube.com/watch?v=v9ejT8FO-7I&t=991s)
