### 8. Security

Goal: Secure your application with OAuth2 (JWT Token)

Required Reading:

- [The Simplest Guide to OAuth 2.0](https://medium.com/@darutk/the-simplest-guide-to-oauth-2-0-8c71bd9a15bb)
- [Authorization Server Reference](https://www.appsdeveloperblog.com/spring-authorization-server-tutorial/)
- [Resource Server Reference](https://www.baeldung.com/spring-security-oauth-resource-server)
- [OAuth2 JWT authentication - example](https://medium.com/swlh/stateless-jwt-authentication-with-spring-boot-a-better-approach-1f5dbae6c30f)

Online Shop:

> Configure your application using OAuth 2.0 in order to access the endpoints securely. We will consider the Customers as the users of the application which needs to be authenticated in order to access any information. 
> You will configure the application as both Authorization Server (which issues Jwt tokens) and Resource Server (which requires a valid token in order to authenticate a request). 
> ![Security flow](https://raw.githubusercontent.com/msg-CareerPaths/spring-training/career-start-2023/diagrams/security.png "Security flow")
> 
> Create a **JwtUtil** class which will handle the creation and the validation of the tokens. 
> This class will have a method to generate a Jwt token from an Authentication object (which contains the credentials of the customer). Note: you can use the Open Source JJWT library (https://github.com/jwtk/jjwt).
> The tokens are signed with a private key and are validated (can be decoded) with a public key (you can use RSA keys for this purpose).
> You need to implement also in JwtUtil class a method which returns a JwtDecoder which will be used as a Bean to validate a token.
> 
> Add also a configuration class in which the SecurityFilterChain Bean is defined as a method in which the http is configured to authorize the requests using jwt tokens from OAuth2. The Configuration class needs also to enable WebSecurity and MethodSecurity.
> 
> Use Postman to test that you are able to issue a token by providing the correct username and password for a customer (For this you will need an endpoint for authentication which will give you the token as response)
> Also test that your endpoints are accessible only if a valid Bearer Token was added in the header of the request. 
>

Further Resources:

- [Spring OAuth 2 Developers Guide](https://developer.okta.com/blog/2019/03/12/oauth2-spring-security-guide)
- [Spring SSO vs Resource Server](https://www.baeldung.com/spring-security-oauth2-enable-resource-server-vs-enable-oauth2-sso)
- [Spring Boot OAuth 2 Guide](https://spring.io/guides/tutorials/spring-boot-oauth2/)
- [Open Source JJWT Library Guide](https://www.baeldung.com/java-json-web-tokens-jjwt)