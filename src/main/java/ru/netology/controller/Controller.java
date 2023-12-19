package ru.netology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.netology.repository.Repos;


import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/products")
public class Controller {
    @Autowired
    Repos reposiroty;

    @GetMapping("/fetch-product")
    protected List<String> getProductName(@RequestParam (value = "name", required = false) String name) {
        return reposiroty.getProductName(name);
    }
}

// http://localhost:8080/products/fetch-product

// http://localhost:8080/products/fetch-product?name=alexey