# First-Java-CRUD
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
<img width="1096" height="831" alt="Screenshot 2025-12-20 025445" src="https://github.com/user-attachments/assets/86c36021-f85a-4e42-9edf-3fdab4a24b47" />

<img width="1079" height="784" alt="Screenshot 2025-12-20 025501" src="https://github.com/user-attachments/assets/a180c370-4182-42c6-9f74-dcf95112ad2a"/> 
<img width="788" height="754" alt="Screenshot 2025-12-20 025608" src="https://github.com/user-attachments/assets/8586dfed-820b-4c63-b07a-c54d8214da1f" />
<img width="1184" height="732" alt="Screenshot 2025-12-20 025642" src="https://github.com/user-attachments/assets/87174898-3630-411d-90b4-aa914e4a3ba3" />
<img width="1207" height="686" alt="Screenshot 2025-12-20 025711" src="https://github.com/user-attachments/assets/f47bab7e-1815-434a-abb9-3ff3a492776a" />

