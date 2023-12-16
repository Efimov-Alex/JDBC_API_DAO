package ru.netology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.repository.Reposiroty;

import java.sql.*;
import java.util.List;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}