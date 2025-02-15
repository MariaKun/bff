package ru.netology.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.entity.Order;
import ru.netology.entity.Product;

import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {

    private final NamedParameterJdbcTemplate template;

    public OrderRepository(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public List<Order> getOrders(int id) {
        String sql = "SELECT * FROM ORDERS WHERE USERID = :id";
        List<Order> result = template.query(sql, Map.of("id", id), BeanPropertyRowMapper.newInstance(Order.class));

        String sql2 = "select *  from products \n" +
                "join orderproduct  on products.id  = orderproduct.productid \n" +
                "where orderid = :orderid";
        for (Order order : result) {
            List<Product> result2 = template.query(sql2, Map.of("orderid", order.getId()), BeanPropertyRowMapper.newInstance(Product.class));
            order.setProducts(result2);
        }

        return result;
    }
}
