package com.example;

import com.example.dal.CustomerDAO;
import com.example.dal.CustomerDAOImpl;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

//	public void doSomething() {
//		CustomerDAO dao = new CustomerDAOImpl(null);
//		CustomerService service = new CustomerServiceImpl(dao);
//		service.findCustomer("john");
//	}

	@Autowired
	JdbcTemplate jdbcTemplate;


}
