
# SpringBoot-Mongo-Docker-Restful

A basic CRUD example was made using Spring boot and mongo.

After installing 'mongo' in Docker, you can trigger the "docker-compose.yml" file in the project.
When this is done, the 'dockerMongoExample' container will run and mongodb will publish from localhost:27017. 


# Project Dependencies

Libraries required for the project  
- Java 11 
- Lombok
- MapStruct 
- Mongo Database 


# Project About

In the project, a mongodb is created on docker with the "docker-compose.yml" file.After running mongo on docker, connection is provided automatically.

After the connection is established, basic CRUD operations can be performed on the project. 'Robo 3T' is used for mongo data representation.

The parameter " Username " is used for crud operations in the project, this parameter can be rewritten according to different conditions! have fun :) 

# CRUD 


| API  | Functions |
| ------------- | ------------- |
| user/add-user  | Create New User  |
| user/get-all-users  | Returns all users   |
| user/get-user/{userName}  | Returns by username   |
| user/delete-user/{userName}  | Delete by username   |
| user/edit-user/{userName}  | Edit by username   |
