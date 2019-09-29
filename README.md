# Spring Boot 2 and OAuth2.0 integration
Spring boot 2.1.8 Oauth2.0 with Oracle database. I have read so many different tutorial where i have found only inmemory database tutorial but after a big try i found this man [Click Here](https://github.com/patternmatch/oauth2-blog) made a great tutorial using PGSQL and i converted it to Oracle. hope this will help you to make better oAuth2.0 security for your project.

The full content you can find in that blog post [Click Here](https://pattern-match.com/blog/2018/10/17/springboot2-with-oauth2-integration/).
he is a nice guy who has explained better than me.

## Running the application
You can use your IDE or command-line.
Here i have used Intellij IDE

```
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
# Oracle settings
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:dbname
spring.datasource.username=hr
spring.datasource.password=12
spring.datasource.driver-class-oracle.jdbc.driver.OracleDriver
```

## Available SpringBoot profiles
* Oracle database connectivity

## Testing the application
First, request an authentication token.
There are two users available.

Admin user:
```
http -a my-client:my-secret --form POST http://localhost:8888/oauth/token username='admin1@pm.com' password='admin123' grant_type='password'
curl -u my-client:my-secret -X POST http://localhost:8888/oauth/token -d "username=admin1@pm.com&password=admin123&grant_type=password"
```

Regular user:
```
http -a my-client:my-secret --form POST http://localhost:8888/oauth/token username='user1@pm.com' password='user123' grant_type='password'
curl -u my-client:my-secret -X POST http://localhost:8888/oauth/token -d "username=user1@pm.com&password=user123&grant_type=password"
```

You should receive an authentication token in a response. The example below.

```
{
    "access_token": "aef2f598-fb6e-4d6c-a72f-ed0e772fd01d",
    "refresh_token": "2a4da32e-ab82-4e56-883e-e44b154795ba",
    "scope": "read write trust",
    "token_type": "bearer"
}
```

Now, use the access_token to access the REST API.

```
http http://localhost:8888/api/hello name=='jafor' access_token=='aef2f598-fb6e-4d6c-a72f-ed0e772fd01d'
curl -H "Authorization: Bearer 2a4da32e-ab82-4e56-883e-e44b154795ba" http://localhost:8080/api/hello?name=jafor
```
You should see `HTTP/1.1 200` in a response.

You can also list all of the active authentication tokens. It's available only for the admin user.

```
http http://localhost:8888/admin/token/list access_token=='aef2f598-fb6e-4d6c-a72f-ed0e772fd01d'
curl -H "Authorization: Bearer 2a4da32e-ab82-4e56-883e-e44b154795ba" http://localhost:8080/admin/token/list
```
You should receive a list in a response.

You can also revoke the authentication token using the following endpoint.

```
http DELETE http://localhost:8888/oauth/revoke access_token=='aef2f598-fb6e-4d6c-a72f-ed0e772fd01d'
curl -X DELETE -H "Authorization: Bearer 2a4da32e-ab82-4e56-883e-e44b154795ba" http://localhost:8080/oauth/revoke
```

You should see `HTTP/1.1 200` in a response.
This token will be removed and you won't be able to access the application using it.

## Available tags
In the blog post you may see that the application is being built incrementally. 
The following describes the tags corresponding to the each step of development.


1. **Oracle-with-user-details-service**
  * OAuth2 authentication configured
  * using in-memory store for clients and tokens
  * using _DelegatingPasswordEncoder_
  * added three different ways of testing the app with spring tools

2. **jdbc-token-store-and-liquibase**
  * using jdbc store for tokens
  * using Oracle database
  * using liquibase to manage database
  
3. **in-database-with-authentication-provider**
  * using authentication provider instead of user details service
  * injecting user name from the security context

4. **roles-and-admin-panel**
  * storing users in the database
  * configuring authorization
  * adding administration panel



