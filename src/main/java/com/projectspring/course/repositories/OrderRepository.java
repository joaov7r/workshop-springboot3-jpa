package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectspring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}