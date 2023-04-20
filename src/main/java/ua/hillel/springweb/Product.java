package ua.hillel.springweb;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cost", nullable = false)
    private double cost;
    @Column(name = "name", nullable = false)
    private String name;




}
