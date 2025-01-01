# SmartTrafficSystem Project

This project is a comprehensive solution for smart traffic management. It includes various components such as a backend built using Java (Maven and Spring Boot), a frontend application using Python (Streamlit), a console-based tool for administration, and database integration for data management.

## Project Structure

### 1. Backend
- **Maven Project:** 
  - Includes servlets and JSP pages for handling traffic data.
  - The `UserServlet.java` handles HTTP requests, and `user.jsp` displays user data.
  - Configured with `web.xml` for servlet initialization.

- **Spring Boot Project:**
  - Implements REST APIs for traffic-related data.
  - Contains a controller (`UserController.java`) and exception handling (`UserException.java`).
  - Configured with `application.properties` for database integration.

### 2. Frontend
- **GUI (Streamlit):**
  - The `app.py` file serves as the main entry point for the frontend, providing an interactive interface for users to visualize traffic data and manage traffic systems.
  - Includes components and static assets for visual representation.

### 3. Console-based Application
- **Console Project:**
  - Provides a command-line interface (CLI) for interacting with the traffic system.
  - The `main.py` script allows users to interact with the system and manage traffic data through Python.

### 4. Database
- **Database Schema:**
  - The `create_tables.sql` script contains SQL statements to create the necessary tables for storing traffic data in a MySQL database.

## Prerequisites
- **Java:** Ensure Java is installed for Maven and Spring Boot projects.
- **Python:** Install Python and Streamlit for frontend.
- **MySQL:** Ensure MySQL is set up and configured for database integration.

## Setup Instructions

### Backend Setup
1. **Maven Project:**
   - Navigate to `backend/MavenProject/`.
   - Run the project using a Maven command:
     ```
     mvn clean install
     mvn jetty:run
     ```

2. **Spring Boot Project:**
   - Navigate to `backend/SpringBootProject/`.
   - Run the Spring Boot application:
     ```
     mvn spring-boot:run
     ```

### Frontend Setup
1. Install Streamlit:
2. Navigate to `frontend/GUIProject/`.
3. Run the Streamlit app:

### Console Setup
1. Navigate to `console/ConsoleProject/`.
2. Run the Python console application:

### Database Setup
1. Set up MySQL and run the `create_tables.sql` script to create the necessary tables.
- Ensure your database connection is correctly configured in both backend projects.

## Features
- Real-time traffic data visualization through Streamlit frontend.
- Traffic management via backend APIs (Maven and Spring Boot).
- Command-line interface for administrative tasks.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
