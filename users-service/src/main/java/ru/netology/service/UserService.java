package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.entity.User;
import ru.netology.repository.UserRepository;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public User getUser(int id) {
        return userRepository.getUser(id);
    }

}