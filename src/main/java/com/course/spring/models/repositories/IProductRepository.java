package com.course.spring.models.repositories;

import org.springframework.data.repository.CrudRepository;
import com.course.spring.models.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long>, CrudRepository<Product, Long> {

}
