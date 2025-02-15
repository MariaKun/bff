package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.entity.GlobalUser;
import ru.netology.entity.Order;
import ru.netology.entity.User;

import java.util.List;

@AllArgsConstructor
@Service
public class MyService {
    private final UserService userService;
    private final OrderService orderService;

    public GlobalUser getUser(int id) {
        User user = userService.getUser(id);
        List<Order> orderList = orderService.getOrders(id);
        return new GlobalUser(user, orderList);
    }
}