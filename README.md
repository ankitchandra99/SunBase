## Technologies Used:

# Backend: Java Spring Boot
# Frontend: HTML, CSS, JavaScript
# Database: MySQL
# Security: Spring Security with JWT authentication
# Getting Started
# To run the application locally, follow these steps:

## Setup Instructions:

1.Clone this repository to your local machine.
2.Navigate to the frontend directory and open the index.html file in your web browser to access 
  the login page.
3.Configure Application Properties:
    I am using MySQL database,so you have to create a database with name "ecommerce".
     
    We have to add database username and password in application.properties file.
    
    spring.datasource.url=jdbc:mysql://localhost:3306/customerdetails? 
    createTableIfNotExists=true
    spring.datasource.username=root
    spring.datasource.password=Amu2020@
    spring.jpa.hibernate.ddl-auto=update

4.Log in with the following credentials:
  Username: ankit
  Password: chandra
5.Once logged in, you can access other functionalities provided by the application.


## Features
User Authentication: Users can log in using their credentials.
User Management: Admin users can add, update, and delete user information.
Search Functionality: Users can search for other users based on different criteria such as city, phone, first name, or email.
