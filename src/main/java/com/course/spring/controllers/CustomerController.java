package com.course.spring.controllers;

import com.course.spring.models.Customer;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = {"/get-customer-by-id"})
    public Customer getCustomerById(@RequestParam(name = "id") int id) {
        return new Customer(id, "Jailson Mendes", "123.456.789-00");
    }
}
