CREATE TABLE ORDERS IF NOT EXISTS (
    id INT NOT NULL AUTO_INCREMENT,
    product_name VARCHAR(255),
    date Date,
    amount INT,
    customer_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id)  REFERENCES CUSTOMERS (id)
);

CREATE TABLE CUSTOMERS IF NOT EXISTS (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    surname VARCHAR(255),
    age INT,
    phone_number VARCHAR(14),
    PRIMARY KEY (id)
);