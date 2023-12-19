package ru.netology.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "ORDERS")
@NamedNativeQuery(
        name = "findProductByName",
        query = "SELECT product_name FROM ORDERS JOIN CUSTOMERS ON ORDERS.customer_id = CUSTOMERS.id WHERE CUSTOMERS.name ILIKE :name"
)
public class ORDERS {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(length = 255, name = "product_name ", nullable = false)
    private String product_name;



    @Column(name = "date")
    private Date date;
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @ManyToOne
    private CUSTOMERS customers;



}