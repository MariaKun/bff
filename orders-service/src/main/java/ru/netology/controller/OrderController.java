package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.Order;
import ru.netology.service.OrderService;

import java.util.List;

@AllArgsConstructor
@RestController
public class OrderController {

    private final OrderService service;

    @GetMapping("/api/orders/by-user/{userid}")
    public List<Order> getOrder(@PathVariable int userid) {
        return service.getOrders(userid);
    }
}

