### OPT-4. Olingo

Goal: expose a subset of the existing business logic via OData services.

Required Reading:

- [Intro to OData](./documents/intro-to-odata.pdf)
- [Olingo OData 2](https://olingo.apache.org/doc/odata2/index.html)
- [OData v2 Examples](./examples/odata)

Online Shop:

> Expose the following entities through a JPA-based OData service:
>
> - Order
> - OrderDetails
> - Product
>
> Use the [JPA-EDM XML mapping](https://olingo.apache.org/doc/odata2/tutorials/jparedefinemetadata.html) to exclude the unneeded JPA entities from the service, exclude any fields of type `LocalDate` or `LocalDateTime` and rename the entities and fields to conform to an UpperCamelCase naming convention.
>
> Create another separate OData service (with a separate Service Factory and separate Servlet) using the core processor. You will have to manually define a `EmdProvider` and a `ODataSingleProcessor` This service should expose the "create order" operation.
>
> Because for creating a new order, you must pass as an input a collection of products and quantities, you should use a *deep insert* OData operation. A deep insert is simply a regular *create* call with also passes the children entities).
