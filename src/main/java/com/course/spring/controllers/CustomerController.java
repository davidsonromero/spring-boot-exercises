package com.course.spring.controllers;

import com.course.spring.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping(path = {"/"})
    public Customer getCustomer() {
        return new Customer(1, "John Doe", "123.456.789-00");
    }

    @PostMapping(path = {"/"})
    public Customer postCustomer(Customer customer) {
        return customer;
    }
}
