package com.example.dal;

import com.example.domain.Customer;
import java.util.List;

public interface CustomerDAO {
  List<Customer> findCustomersByName(String name);
  void createCustomers(List<Object[]> splitUpNames);
  List<Customer> findAllCustomers();
}
