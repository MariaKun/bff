package ru.netology.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.entity.User;

import java.util.Map;

@Repository
public class UserRepository {

    private final NamedParameterJdbcTemplate template;

    public UserRepository(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public User getUser(int id) {
        String sql = "SELECT * FROM USERS WHERE ID = :id";
        User result = template.queryForObject(sql, Map.of("id", id), BeanPropertyRowMapper.newInstance(User.class));
        System.out.println(result);
        return result;
    }
}
