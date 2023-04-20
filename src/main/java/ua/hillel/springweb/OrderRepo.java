package ua.hillel.springweb;

import java.util.List;

public interface OrderRepo {
    Order findById(Integer id);
    List<Order> getAll();
    Order save(Order order);
}
