CREATE TABLE USERS (
    id SERIAL NOT NULL,
    name VARCHAR(255),
    surname VARCHAR(255),
    login VARCHAR(255),
    password VARCHAR(255),
    city VARCHAR(14),
    PRIMARY KEY (id)
);

alter table USERS drop column city;