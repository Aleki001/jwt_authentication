## JWT AUTHENTICATION AND AUTHORIZATION
### Introduction
I implemented Jwt authentication to secure my app using json web tokens and authorize using role based authorization.
The client registers and creates a account where he/she shall signin and therefore shall get a token that will be used to access the protected routes. To access the protected routes, add the access token gotten after logging to the authorization header.



## Setup and Installation
**Clone the repository:**
 ```bash
    git clone https://github.com/aleki001/jwt_authentication.git
    cd jwt_authentication
  ```

## Databases
Check the application properties to  set database configurations.
Run the scripts below to manually add roles to the database:
```bash
    INSERT INTO `roles` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
```

## Run the application
Install the necessary maven dependancies by running ```mvn install``` then run the application.
