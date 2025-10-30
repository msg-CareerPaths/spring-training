### OPT-7. Java Mail

Goal: Send confirmation emails to customers when orders are created.

Required Reading:

- [Guide to Spring Mail](https://www.baeldung.com/spring-email)
- [Spring Expression Language](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#expressions)

Online Shop:

> Create a `@Service` class for sending email messages with both HTML and plain text bodies. The bodies and subject should be configurable via application properties, whilst the bodies should contain SpEL placeholders which should be replaced at runtime by parsing and evaluating the SpEL expressions.
>
> Register an account on [mailtrap.io](https://mailtrap.io) and use the `Default Inbox` credentials to connect to their SMTP server.
>
> Lastly, use the email service created previously to send confirmation emails to customers once an Order has been successfully created.

Further Resources:

- [Sending Emails with Java](https://www.baeldung.com/java-email)
- [Spring Email Reference](https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/integration.html#mail)
