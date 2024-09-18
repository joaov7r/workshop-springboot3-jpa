package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectspring.course.entities.OrderItem;
import com.projectspring.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}