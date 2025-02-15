package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.GlobalUser;
import ru.netology.service.MyService;

@AllArgsConstructor
@RestController
public class MyController {

    private final MyService service;

    @GetMapping("/api/site-bff/user/{userid}")
    public GlobalUser getUser(@PathVariable int userid) {
        return service.getUser(userid);
    }
}

