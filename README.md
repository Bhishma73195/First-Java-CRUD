# FirstRestAPI
FirstRestAPI – 
Project Description
This project is a simple REST API developed using Spring Boot as part of Task 2 for the Spring
Framework course at Vistula University. The application demonstrates basic CRUD operations using
layered architecture.
Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Swagger (OpenAPI)
- Maven
Project Structure
The project follows a layered architecture:
- Controller layer handles HTTP requests
- Service layer contains business logic
- Repository layer handles database operations
- Domain layer contains entity classes
- Support layer contains mappers and exception handling
How to Run the Application
1. Open the project in IntelliJ IDEA
2. Make sure Java 17 is installed
3. Reload Maven dependencies
4. Run the FirstRestApiApplication class
Swagger API Documentation
Swagger UI is available at:
http://localhost:8080/swagger-ui/index.html
Example endpoints:
- POST /api/v1/products
- GET /api/v1/products
- GET /api/v1/products/{id}
- PUT /api/v1/products/{id}
- DELETE /api/v1/products/{id}
Example Request (POST)
{
"name": "Laptop"
}
H2 Database
H2 Console is available at:
http://localhost:8080/console
JDBC URL:
jdbc:h2:mem:testdb
Exception Handling
If a product with a given ID does not exist, the API returns HTTP 404 with a JSON error message.
Example:
{
"message": "Product not fou<img width="1482" height="818" alt="Screenshot 2025-12-19 171333" src="https://github.com/user-attachments/assets/276d49fe-2b1d-4f1b-856a-814082501fc6" />
nd with id: 99"
}
<img width="1483" height="885" alt="Screenshot 2025-12-19 171259" src="https://github.com/user-attachments/assets/ff7a3f14-676d-42ef-8214-9533bc821e6f" />

