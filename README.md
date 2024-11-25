# Smart Traffic Management System

## Overview
A Java-based project that simulates a traffic management system with database integration. It manages traffic signals and tracks vehicle activity.

## Features
- Retrieve traffic signal information.
- Update traffic signal status (RED, GREEN, YELLOW).
- Track vehicles passing through signals.

## Project Structure
- `app`: Contains the main application logic.
- `dao`: Handles database operations.
- `model`: Contains Java objects representing database entities.
- `util`: Utility classes like database connection.
- `resources`: SQL schema and configuration files.

## Database Setup
1. Create a database named `smart_traffic_db`.
2. Run the SQL script in `src/main/resources/schema.sql` to create tables.

## Running the Project
1. Configure the database connection in `DatabaseConnection.java`.
2. Compile and run the project using your preferred IDE or command line.

## Dependencies
- Java 8+
- MySQL 5.7+
- MySQL Connector/J (Maven dependency included)
