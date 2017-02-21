package com.example.dal;

import com.example.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CustomerDAO {

    List<Customer> findCustomersByName(String name);
    void createCustomers(List<Object[]> splitUpNames);
}
