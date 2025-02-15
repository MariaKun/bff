package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.User;
import ru.netology.service.UserService;


@AllArgsConstructor
@RestController
public class UserController {

    private final UserService service;

    @GetMapping("/api/users/{userid}")
    public User getUser(@PathVariable int userid) {
        return service.getUser(userid);
    }


}

