# first-project-java-spring-TASK2
# 📚 Spring Boot REST API Project

## 📌 Project Overview
This is a **REST API application** for product management built using Spring Boot. The project demonstrates core REST API development principles with proper layering, exception handling, database integration, and API documentation.

## 🚀 Technologies Used
- **Java 21**
- **Spring Boot 3.x**
- **Spring Web** (REST API)
- **Spring Data JPA** (Database operations)
- **H2 Database** (In-memory database)
- **SpringDoc OpenAPI** (Swagger UI)
- **Maven** (Build tool)
- **Lombok** (Reduces boilerplate code)
- **Postman/Insomnia** (API testing)

## 📁 Project Structure
src/main/java/pl/edu/vistula/firstrestapispring/
├── product/ # Main package
│ ├── api/ # Controllers
│ │ ├── request/ # Request DTOs
│ │ │ ├── ProductRequest.java
│ │ │ └── UpdateProductRequest.java
│ │ ├── response/ # Response DTOs
│ │ │ └── ProductResponse.java
│ │ └── ProductController.java
│ ├── domain/ # Entity classes
│ │ └── Product.java # Product entity
│ ├── repository/ # Data access
│ │ └── ProductRepository.java # JPA Repository
│ ├── service/ # Business logic
│ │ └── ProductService.java
│ └── support/ # Support classes
│ ├── exception/ # Exception handling
│ │ ├── ProductExceptionAdvisor.java
│ │ ├── ProductExceptionSupplier.java
│ │ └── ProductNotFoundException.java
│ └── ProductMapper.java
├── shared/
│ └── api/
│ └── response/
│ └── ErrorMessageResponse.java
└── FirstRestApiSpringApplication.java

## 🛠️ Setup & Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse)
- Postman or similar

# 📋 What This Project Does

## 🎯 Main Purpose
This is a **REST API application for product management** (Product Management System) that allows performing all basic data operations through HTTP requests.

## 🔧 Core Functionalities

### 1. **Create Products** (Create)
- Add new products to the system
- Each product automatically receives a unique ID
- Example: add a new laptop to the catalog

### 2. **View Products** (Read)
- Get information about a specific product by its ID
- Get a list of all products in the system
- Example: view product specifications or the entire assortment

### 3. **Update Products** (Update)
- Modify information about existing products
- Update product name or other data
- Example: correct product description or change price

### 4. **Delete Products** (Delete)
- Remove products from the system
- Example: remove discontinued products

### 5. **Error Handling**
- If requesting a non-existent product → returns clear 404 error
- If something goes wrong → system explains what happened


# TASK2
