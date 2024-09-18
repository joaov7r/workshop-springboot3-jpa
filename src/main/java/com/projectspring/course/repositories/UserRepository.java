package com.projectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}