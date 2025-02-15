package ru.netology.entity;

import lombok.*;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String description;
    private int price;
}
