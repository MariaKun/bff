package ru.netology.entity;

import lombok.*;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private String surname;
    private String phone_number;
    private String address;
    private String email;
}
