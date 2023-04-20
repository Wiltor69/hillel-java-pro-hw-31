package ua.hillel.springweb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceMemory implements OrderService{
    private List<OrderDTO> orders = new ArrayList<>();
    @Override
    public List<OrderDTO> getAllOrders() {
        return orders;
    }

    @Override
    public OrderDTO getOrderById(int id) {
        return orders.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public OrderDTO addOrder(OrderDTO orderDTO) {
        orders.add(orderDTO);
        return orderDTO;
    }
}
