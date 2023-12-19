package ru.netology.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class Repos {

    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        var query = entityManager.createNamedQuery("findProductByName");
        query.setParameter("name", name);
        List<String> productList = query.getResultList();

        return productList;
    }


}