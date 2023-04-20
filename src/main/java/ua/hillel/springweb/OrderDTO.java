package ua.hillel.springweb;

import lombok.Data;

import java.time.LocalDate;


import java.time.LocalDate;
@Data
public class OrderDTO {
    private Integer id;
    private Product product;
    private Double cost;
    private LocalDate date;
}
