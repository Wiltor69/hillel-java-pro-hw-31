package ua.hillel.springweb;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service
@RequiredArgsConstructor
public class OrderServiceImp implements OrderService{

    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;
    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public OrderDTO getOrderById(int id) {
        return null;
    }

    @Override
    public OrderDTO addOrder(OrderDTO orderDTO) {

        return orderDTO;
    }
}
