package com.product.demo;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.product.demo.dao.ProductRepository;
import com.product.demo.services.ProductService;



@SpringBootApplication
public class SpringProductAppApplication {
	
	@Autowired
	ProductRepository productrepo;
	
	@Autowired
	ProductService productservice;


	public static void main(String[] args) {
		SpringApplication.run(SpringProductAppApplication.class, args);
	}
	

}
