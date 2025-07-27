# SocialMediaFeed API

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>
   
An easy-to-use online application, this project enables users to log in, register, and maintain their personal data. Users also have the option of posting and viewing posts made by other users. Tokens used for authentication are used by the programme to protect user information and guarantee that only authorised users may access particular functionalities.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
By adding the correct database URL, user name, and password to the application.properties file, you can connect to a MySQL database. It's time to update the following properties:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* User Model
```
Id : integer
firstName : string
lastName : string
instagramName : string
instagramBio : string
email : string
password : string
dOB : LocalDate
phoneNumber : string
isBlueTicked : boolean
```

* PostLike Model
```
Id : Long
post : Post(ManyToOne)
User : user(ManyToOne)
```

* Post Model
```
postId = Integer
createdDate : LocalDateTime
postData : String
postCaption : string
location : string
@ManyToOne
user : User
```

* InstagramFollowing Model
```
followingTableId = Long
user : User (OneToOne)
following : User (OneToOne)
```

* InstagramFollower Model
```
followerTableId = Long
user : User (OneToOne)
follower : User (OneToOne)
```

* InstagramComment Model
```
commentId = Long
commentBody : String
post : Post(ManyToOne)
user : User (ManyToOne)
```

* Authentication Token 
```
tokenId : Long
token : string
tokenCreationDate : LocalDate
@OneToOne 
user : User
```

* Admin Token 
```
adminId : Long
firstName : string
lastName : string
email : string

```
## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:

* User Controller:
```
POST /user/signup: create a new user account
POST /user/signin: authenticate a user and receive an authentication token
PUT /user: update user details
DELETE /user/signout: authenticate a user and delete authentication token
POST /user/like - like the post
POST //follow/{myId}/{otherId} - to follow the user
```

* Post Controller
```
POST /post: create a new post
GET /post: get all posts
GET /{postId}/likeCount : get likeCount based on postId.
```

* Admin Controller
```
PUT /user/{id}/{blueTick}: update the blue ticket
```

* Comment Controller
```
POST /comment: post the comment
```

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The project consists of a straightforward web application created with Java and the Spring framework. Users can create an account, log in, and manage their profile data. In addition, users can see and create posts. To protect user information and guarantee that only authenticated users can access particular functionalities, the application uses authentication tokens. User signup, signin, and update information, post creation and retrieval, and creation of authentication tokens are all included in the API endpoints. 


## Author

👤 **Nitesh Choudhary**

* GitHub: [Nitesh choudhary](https://github.com/nitesh1710)

* LinkedIn: [Nitesh choudhary](https://www.linkedin.com/in/niteshchoudhary17/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome.
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Nitesh Choudhary](https://github.com/nitesh1710).<br />
    
---
