# Spring Boot MongoDB API
A REST API Spring Boot server for Read operations in MongoDB. This application will accept a GET HTTP requests to perform READ ALL operation form a MongoDB database.

## How to install and run this application
Make sure Apache Maven is installed in your system. Navigate to the spring-mongodb-api folder and use terminal to run the following command to build the application:

```bash
./mvnw clean package
```

Once the application is built, run the application using the following command:

```bash
./mvnw spring-boot:run
```

## The Database
The connected MongoDB database consistes of a collection ```users``` which contains documents with the following schema:

```
{
    first_name: STRING
    last_name:  STRING,
    email:  STRING,
    age: INTEGER,
    interest: [
        {
            name:  STRING,
            priority:  STRING
        }
    ]
}
```

All data outputted from this application will follow the above format as a JSON object.

## Routes
The API only has one route and one option for a HTTP GET request:

|     Routes       |     HTTP   Method    |     Description                           |
|------------------|----------------------|-------------------------------------------|
|     /user        |     GET              |     Display all user data                 |

