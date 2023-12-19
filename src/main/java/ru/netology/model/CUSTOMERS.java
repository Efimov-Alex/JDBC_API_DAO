package ru.netology.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "CUSTOMERS")

public class CUSTOMERS {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(length = 255, name = "name", nullable = false)
    private String name;
    @Column(length = 255, name = "surname", nullable = false)
    private String surname;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(length = 14, name = "phone_number", nullable = false)
    private String phoneNumber;



}
