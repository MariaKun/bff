package ru.netology.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class GlobalUser {

    private int id;

    private String name;

    private String surname;

    private String phone_number;

    private String address;

    private String email;

    private List<Order> orders;

    public GlobalUser(User user, List<Order> orders) {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.phone_number = user.getPhone_number();
        this.address = user.getAddress();
        this.email = user.getEmail();
        this.orders = orders;
    }
}
