package ua.hillel.springweb;

public interface OrderMapper {

    Order OrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO OrderToOrderDTO(Order order);
}
