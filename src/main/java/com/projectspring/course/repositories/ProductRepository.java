package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectspring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}