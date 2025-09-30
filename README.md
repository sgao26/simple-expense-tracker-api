Expense Tracker API

A RESTful API built with Spring Boot for tracking personal expenses. This project allows you to add, retrieve, and analyze your spending patterns by adding them to a list using the API.


Project Description

This is a simple expense tracking tool that provides:
- REST API endpoints for creating and reading expenses (was having some issues with updating and deleting so I removed them)
- H2 database for easy setup and testing (wanted to make a permanent database to store expenses but I ran out of time so the expenses will be cleared when the process is restarted)
- Basic web interface for testing the API


Setup Steps

1. Install Java 17 and Maven 3.6

2. Set JAVA_HOME
   ```bash
   export JAVA_HOME=/usr/local/opt/openjdk@17
   export PATH="/usr/local/opt/openjdk@17/bin:$PATH"
   ```


How to Run

1. Navigate to the project directory (design1_somethingnew/api-expense-track)
2. Run this command:
     JAVA_HOME=/usr/local/opt/openjdk@17 mvn spring-boot:run
3. Open browser to http://localhost:8080


## API Endpoints
- `POST /expenses` - Add a new expense
- `GET /expenses` - Get all expenses


Tools and Frameworks
- Spring Boot 3.5.6
- Spring Data JPA
- H2 Database
- Maven
- Spring Initializer


External Resources Used
https://www.w3schools.com/java/java_ref_reference.asp
https://docs.spring.io/spring-boot/reference/index.html

example of what it looks like is the png file called result.png

