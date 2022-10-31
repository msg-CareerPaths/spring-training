### 6. Custom Format Support

Goal: Add support for a custom data format (CSV) for response bodies.

Required Reading:

- [Customizing Response Rendering](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/html/howto-spring-mvc.html#howto-customize-the-responsebody-rendering)
- [CSV with Jackson](http://www.cowtowncoder.com/blog/archives/2012/03/entry_468.html)

Online Shop:

> Create a service class that handles the export of stocks. It has one method for exporting the stock of a given location (input = location ID, output = list of stocks).
>
> Create a message converter for CSV handling, using the [Jackson CSV library](https://github.com/FasterXML/jackson-dataformats-text/tree/master/csv). First create a utility class that has the following methods and then wrap it into a subclass of `AbstractGenericHttpMessageConverter`:
>
> - `fromCsv`:
    >   - Has a generic type parameter `<T>`, representing the type of the POJOs stored in the CSV,
>   - Returns a `List<T>`,
>   - Has a parameter `Class<T>`,
>   - Has an input stream parameter containing the CSV file.
> - `toCsv`:
    >   - Has a generic type parameter `<T>`, representing type of the POJOs stored in the CSV,
>   - Returns `void`,
>   - Has a parameter `Class<T>`,
>   - Has a parameter `List<T>`, representing the list of POJOs to be written in the CSV,
>   - Has an output stream parameter in which the CSV file is written.
>
> Create a Rest Controller for the "Export stock" operation with a `GET` mapping producing a CSV response.

Further Resources:

- [Jackson CSV library](https://github.com/FasterXML/jackson-dataformats-text/tree/master/csv)
- [HTTP Message Converters](https://www.baeldung.com/spring-httpmessageconverter-rest)
