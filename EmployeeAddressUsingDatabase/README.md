# EmployeeAddressUsingDatabase


this Api work is to take input of employee and address vlaues like applied firstName , lastName &  in address street, city,state,pincode and with it it will make a Employee and adress table  data.

## Frameworks and Language Used

The following frameworks and languages were used in the development of this project:

- Java
- Spring Boot
- SQL 
## Data Flow

The following functions were used in this project:

1. Controller - This component is responsible for handling the incoming requests and processing them.
2. Services - This component provides business logic to the application.
3. Repository - This component interacts with the database.
4. Module - This component is responsible for the design of the schema.

## Data Structure

The following data structures were used in this project:

- ArrayList

## brief description of each of the components in the context of the code:

### Controller
The controller is responsible for handling incoming requests and returning appropriate responses. In the code, it have a Employee and adress which handles requests related to the user entity. It has methods such as firstName , lastName &  in address street, city,state,pincode These methods use the UserService to perform CRUD (create, read, update, delete) operations on the user data.

### Service
The service layer contains the business logic of the project. It acts as an intermediary between the controller and the repository. In the code, it have a Employee and adress. These methods perform validation on the input data and delegate database operations to the EmployeeRepository and addressRepository.

### Repository
In the code, it have a IjobRepository. This interface provides basic CRUD operations.

### Module
In the code, i have created a module named Employee and adress which contains the Employee and adress entity class. This class represents the data model of the user and contains properties such as  firstName , lastName &  in address street, city,state,pincode.
Overall, these components work together to create a layered architecture for your project, which separates concerns and promotes modularity and maintainability.

## Project Summary

The aim of this project is to create a system that can take input data and use it to create a project. The system is built using Java and Spring Boot SQLdatabase.The data flow is handled by the Controller, Services, and Repository components, with the Database Design being responsible for the schema. The project also makes use of arrayslists to store and manipulate data.
