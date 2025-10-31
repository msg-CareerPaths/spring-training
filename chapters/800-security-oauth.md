## 8. Security - OAuth

Goal: Secure your application with OAuth2 (JWT Token)

Required Reading:

- [The Simplest Guide to OAuth 2.0](https://medium.com/@darutk/the-simplest-guide-to-oauth-2-0-8c71bd9a15bb)
- [Authorization Server Reference](https://www.appsdeveloperblog.com/spring-authorization-server-tutorial/)
- [Spring Security OAuth 2.0 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html)
- [OAuth2 JWT authentication - example](https://dev.to/pryhmez/implementing-spring-security-6-with-spring-boot-3-a-guide-to-oauth-and-jwt-with-nimbus-for-authentication-2lhf)
- [Resource Server Reference](https://www.baeldung.com/spring-security-oauth-resource-server)
- [Global CORS configuration](https://docs.spring.io/spring-framework/reference/web/webmvc-cors.html#mvc-cors-global)

Online Shop:

> Configure your application using OAuth 2.0 in order to access the endpoints securely. We will consider the Customers as the users of the application which needs to be authenticated in order to access any information. 
> You will configure the application as both Authorization Server (which issues Jwt tokens) and Resource Server (which requires a valid token in order to authenticate a request). 
> ![Security flow](https://raw.githubusercontent.com/msg-CareerPaths/spring-training/bootcamp-2025/diagrams/security.png "Security flow")
> 
> Create a **JwtUtil** class which will handle the creation and the validation of the tokens. 
> This class will have a method to generate a Jwt token from an Authentication object (which contains the credentials of the customer). Note: you can use the Open Source JJWT library (https://github.com/jwtk/jjwt).
> The tokens are signed with a private key and are validated (can be decoded) with a public key (you can use RSA keys for this purpose).
> You need to implement also in JwtUtil class a method which returns a JwtDecoder which will be used as a Bean to validate a token.
> 
> Add also a configuration class in which the SecurityFilterChain Bean is defined as a method in which the http is configured to authorize the requests using jwt tokens from OAuth2. The Configuration class needs also to enable WebSecurity and MethodSecurity.
> 
> Use Postman to test that you are able to issue a token by providing the correct username and password for a customer (For this you will need an endpoint for authentication which will give you the token as response).
> Also test that your endpoints are accessible only if a valid Bearer Token was added in the header of the request. 
>
> The User can have one of the two roles: *CUSTOMER* or *ADMIN*. Some action can be performed only by an admin, such as order deletion.
> Test that the application does not allow DELETE requests from customers, with Postman.
>
> *Hint: Keep in mind that later, when you will call the implemented API via the frontend while working on the React/Angular training, the requests will fail due to missing CORS configuration. Check the provided resources to see how to fix this.*

Further Resources:

- [Spring Security Reference](https://docs.spring.io/spring-security/reference/index.html)
- [Spring Boot OAuth 2 Guide](https://spring.io/guides/tutorials/spring-boot-oauth2/)
- [Migrate Application from Spring Security 5 to Spring Security 6](https://www.baeldung.com/spring-security-migrate-5-to-6)
- [Open Source JJWT Library Guide](https://www.baeldung.com/java-json-web-tokens-jjwt)
- [JWT essentials (RFC 7519)](https://www.rfc-editor.org/rfc/rfc7519)
