package com.course.spring.controllers;

import com.course.spring.models.entities.Product;
import com.course.spring.models.repositories.IProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductRepository productRepository;
    @PostMapping("/create")
    public Product create(@Valid Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/list")
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @GetMapping("/find")
    public Product find(@RequestParam(name = "id") Long id) {
        return productRepository.findById(id).get();
    }

    @PutMapping("/update")
    public Product update(@Valid Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam(name = "id") Long id) {
        productRepository.deleteById(id);
    }

    @GetMapping("/listPageable")
    public Iterable<Product> listPageable(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "10") int size) {
        if(size > 10) size = 10;
        return productRepository.findAll(PageRequest.of(page, size));
    }
}
