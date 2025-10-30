## 6. Strategy Design Pattern

Goal: Apply Strategy Design Pattern for Order Creation operation.

Required Reading:

- [Order Strategies](https://github.com/msg-CareerPaths/spring-training/blob/bootcamp-2025/documents/order-strategies.md)
- [Strategy Design Pattern](https://en.wikipedia.org/wiki/Strategy_pattern)
- [Spring @Value annotation](https://www.baeldung.com/spring-value-annotation)

Online Shop:

> Enhance the Service for Order Creation implemented in the previous chapter in the following way: 
> - The service has to select a strategy for finding from which locations should the products be taken. The strategy should be selected based on a `@Configuration`. The following initial strategies should be created:
>   - **Single Location**  - the method implemented in the previous chapter.
>   - **Most abundant** - take each product from the location which has the largest stock for that particular product.
> - The service then runs the strategy, obtaining a list of objects with the following structure: location, product, quantity (= how many items of the given product are taken from the given location). If the strategy is unable to find a suitable set of locations, it should throw an exception.

Further Resources:

- [SQL Examples](https://github.com/msg-CareerPaths/spring-training/blob/bootcamp-2025/documents/find-row-with-max-sql.pdf)
- [ConditionalOnProperty](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/api/org/springframework/boot/autoconfigure/condition/ConditionalOnProperty.html)
- [Strategy Design Pattern](https://www.youtube.com/watch?v=v9ejT8FO-7I&t=991s)
- [@Value annotation](https://www.youtube.com/watch?v=vLSyFktOm4g&ab_channel=DanVega)