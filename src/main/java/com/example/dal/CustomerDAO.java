package com.example.dal;

import com.example.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> findCustomersByName(String name) {
        return jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?",
                new Object[] { name },
                (rs, rowNum) ->
                        new Customer(rs.getLong("id"),
                                rs.getString("first_name"),
                                rs.getString("last_name"))
        );
    }

    public void createCustomers(List<Object[]> splitUpNames) {
        //splitUpNames is list of object[] where [0] is first name and [1] is the last name
        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);
    }
}
