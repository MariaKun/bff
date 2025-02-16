package ru.netology.service;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.entity.GlobalUser;
import ru.netology.entity.Order;
import ru.netology.entity.User;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

@AllArgsConstructor
@Service
public class MyService {

    public GlobalUser getUser(int id) {
        RequestSpecification spec = given()
                .baseUri("http://localhost:8080/api");
        
        User user = given().spec(spec)
                .contentType(ContentType.JSON)
                .get("/users/" + id)
                .then()
                .extract().as(User.class);

        List<Order> orderList = Arrays.stream(given().spec(spec)
                .contentType(ContentType.JSON)
                .get("/orders/by-user/" + id)
                .then()
                .extract().as(Order[].class)).toList();

        return new GlobalUser(user, orderList);
    }
}