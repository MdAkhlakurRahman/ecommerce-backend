# E-Commerce Backend API

Backend REST API for an e-commerce system built using Spring Boot, focusing on scalability, clean architecture, and performance.

## Tech Stack

* **Java:** 21 (LTS)
* **Framework:** Spring Boot 3.2.6
* **Persistence:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Build Tool:** Maven
* **Documentation:** Swagger OpenAPI
* **Version Control:** Git

## Features

* Product management REST APIs
* Pagination, sorting, and filtering
* Global exception handling and validation
* MySQL database integration using JPA/Hibernate
* Swagger UI for API documentation
* Layered architecture (Controller, Service, Repository)

## Architecture
This project follows a **layered backend architecture**:
- **Controller Layer:** Handles HTTP requests and responses
- **Service Layer:** Contains business logic
- **Repository Layer:** Manages database interactions using JPA

## Sample APIs

```http
POST /api/products
GET  /api/products?page=0&size=10&sortBy=price
GET  /api/products?category=Electronics

```

## API Documentation

Once the application is running, access the Swagger UI here:
[http://localhost:8080/swagger-ui/index.html](https://www.google.com/search?q=http://localhost:8080/swagger-ui/index.html)

## Run Locally

1. **Clone the repository**
2. **Configure MySQL:**
Create the database in your local MySQL instance:
```sql
CREATE DATABASE ecommerce_db;

```


3. **Build and Run:**
```bash
mvn clean install
mvn spring-boot:run

```



## Key Highlights

* **Performance:** Implemented efficient pagination and sorting using Spring Data JPA.
* **Resilience:** Designed clean REST APIs with robust validation and global exception handling.
* **Modern Stack:** Resolved Swagger compatibility by aligning Spring Boot 3.x LTS and JDK 21.
* **Best Practices:** Followed industry-standard backend architecture and Git workflow.

## Author

**Md Akhlakur Rahman** Backend Developer | Java | Spring Boot
