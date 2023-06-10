
    CREATE DATABASE employee_creation_db;
    USE employee_creation_db;
    CREATE TABLE employee (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        pin INT NOT NULL UNIQUE
    );
