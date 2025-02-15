package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.entity.Order;
import ru.netology.repository.OrderRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService {

    private final OrderRepository userRepository;

    public List<Order> getOrders(int id) {
        return userRepository.getOrders(id);
    }

}