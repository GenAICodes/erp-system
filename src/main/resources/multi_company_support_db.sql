
    CREATE DATABASE multi_company_support_db;
    USE multi_company_support_db;
    CREATE TABLE company (
        id BIGINT NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        admin_id BIGINT NOT NULL,
        PRIMARY KEY (id)
    );
    CREATE TABLE employee (
        id BIGINT NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        pin INT NOT NULL,
        company_id BIGINT NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (company_id) REFERENCES company(id)
    );
    CREATE TABLE production (
        id BIGINT NOT NULL AUTO_INCREMENT,
        employee_id BIGINT NOT NULL,
        date DATE NOT NULL,
        quantity INT NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (employee_id) REFERENCES employee(id)
    );
