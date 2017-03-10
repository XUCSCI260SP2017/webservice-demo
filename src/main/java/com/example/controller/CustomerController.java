package com.example.controller;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/findCustomers/{firstName}")
    @ResponseBody
    public List<Customer> findCustomerByName(@PathVariable("firstName")String firstName) {
        return customerService.findCustomer(firstName);
    }

    @RequestMapping(value = "/showAllCustomers")
    public String findAllCustomers( Model model) {
        model.addAttribute("customers", customerService.findAllCustomers());
        return "showAllCustomers";
    }


}
