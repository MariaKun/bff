package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import ru.netology.entity.GlobalUser;
import ru.netology.entity.Order;
import ru.netology.entity.User;

import java.util.Arrays;

@AllArgsConstructor
@Service
public class MyService {

    public GlobalUser getUser(int id) {

        RestClient restClient = RestClient.create("http://localhost:8080/api");

        User user = restClient
                .get()
                .uri("/users/" + id)
                .retrieve()
                .body(User.class);

        Order[] orderList = restClient
                .get()
                .uri("/orders/by-user/" + id)
                .retrieve().body(Order[].class);

        return new GlobalUser(user, Arrays.stream(orderList).toList());
    }
}