package ru.netology.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private int id;
    private int userid;
    private int summ;
    private String currency;
    private List<Product> products;
}
