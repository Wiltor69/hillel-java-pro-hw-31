package ua.hillel.springweb;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name = "Orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product", nullable = false)
    private Product product;
    @Column(name = "cost", nullable = false)
    private double cost;
    @Column(name = "data", nullable = false)
    private LocalDate date;


}
