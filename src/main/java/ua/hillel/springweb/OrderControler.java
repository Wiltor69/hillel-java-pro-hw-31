package ua.hillel.springweb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("Orders")
@RestController
@RequiredArgsConstructor
public class OrderControler {

    private final OrderService orderService;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<OrderDTO>> getAllOrder() {
        List<OrderDTO> allUsers = orderService.getAllOrders();
        return ResponseEntity.ok(allUsers);
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    ResponseEntity<OrderDTO> getUserById(@PathVariable("id") Integer id) throws UserNotFoundException {
        OrderDTO orderById = orderService.getOrderById(id);

        return ResponseEntity.ok(orderById);
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<OrderDTO> addUser(@RequestBody OrderDTO orderDTO) {
        OrderDTO addedOrder = orderService.addOrder(orderDTO);
        return ResponseEntity.ok(addedOrder);
    }

}

