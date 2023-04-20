package ua.hillel.springweb;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(int id);
    OrderDTO addOrder(OrderDTO orderDTO);
}
