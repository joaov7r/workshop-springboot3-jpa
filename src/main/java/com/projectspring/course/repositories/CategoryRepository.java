package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectspring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}