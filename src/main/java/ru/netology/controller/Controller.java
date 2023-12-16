package ru.netology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.netology.repository.Reposiroty;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/products")
public class Controller {

    @Autowired
    Reposiroty reposiroty;

    @GetMapping("/fetch-product")
    public ResponseEntity<List<String>> findByName(@RequestParam(value = "name", required = false) String name) {
        try {
            List<String> names = reposiroty.getProductName(name);



            if (names.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(names, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

// http://localhost:8080/products/fetch-product

// http://localhost:8080/products/fetch-product?name=alexey