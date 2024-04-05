## Technologies Used:

1.Backend: Java Spring Boot :

2.Frontend: HTML, CSS, JavaScript:

3.Database: MySQL:

4.Security: Spring Security with JWT authentication
  Getting Started:

To run the application locally, follow these steps:

## Setup Instructions:

1.Clone this repository to your local machine.

2.Navigate to the frontend directory and open the index.html file in your web browser to access 
  the login page.

3.Configure Application Properties:
    I am using MySQL database,so you have to create a database with name "customerdetails".
     
    We have to add database username and password in application.properties file.
    
    spring.datasource.url=jdbc:mysql://localhost:3306/customerdetails? 
    createTableIfNotExists=true
    spring.datasource.username=root
    spring.datasource.password=Amu2020@
    spring.jpa.hibernate.ddl-auto=update

4.Log in with the following credentials:
  
   # Username:ankit
  
   # Password:chandra

  Page
  ![Screenshot 2024-04-05 081013](https://github.com/ankitchandra99/SunBase/assets/126271360/2f6b4f14-c726-4d3e-9683-995867b1a7a6)

5.Once logged in, you can access other functionalities provided by the application.

  page

  ![Screenshot 2024-04-05 081241](https://github.com/ankitchandra99/SunBase/assets/126271360/6b961bd5-470d-490c-b1cf-31db552f6983)


![Screenshot 2024-04-05 081304](https://github.com/ankitchandra99/SunBase/assets/126271360/3e5ed305-d3d9-4aa5-851c-01d3222e18ce)


![Screenshot 2024-04-05 082434](https://github.com/ankitchandra99/SunBase/assets/126271360/94855821-5528-4514-a3f7-39a42d185047)


![image](https://github.com/ankitchandra99/SunBase/assets/126271360/a3e5d099-566c-4cfd-8820-3c530bc5d83c)




## Features
User Authentication: Users can log in using their credentials.
User Management: Admin users can add, update, and delete user information.
Search Functionality: Users can search for other users based on different criteria such as city, phone, first name, or email.

## Endpoints:
AuthController
This controller handles user authentication.


## POST /auth/login

Description: Allows users to log in and generates a JWT token upon successful authentication.

Request Body:
email: User's email
password: User's password

Response Body:
jwtToken: JWT token for authentication
username: User's username

Exception Handlers:
ExceptionHandler
Description: Handles errors during authentication.
Response Body: "Credentials Invalid !!"
CustomerController
This controller manages customer-related operations.


## POST /customer/create

Description: Creates a new customer.

Request Body: Customer details

Request Parameters: SyncDb (boolean)

## PUT /customer/update/{email}

Description: Updates an existing customer.

Path Variable: Customer's email

Request Body: Updated customer details

## GET /customer/getCustomers
Description: Retrieves a list of customers.

Request Parameters: Pagination details, sorting, and search criteria

## GET /customer/get/{email}
Description: Retrieves a customer by email.

Path Variable: Customer's email

## GET /customer/searchBy
Description: Searches for customers based on specific criteria.

Request Parameters: Search criteria

## DELETE /customer/delete
Description: Deletes a customer.

Request Parameter: Customer's email

## GET /customer/sync
Description: Retrieves customer data from an external API.
