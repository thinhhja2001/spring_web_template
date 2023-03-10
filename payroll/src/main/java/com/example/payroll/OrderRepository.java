package com.example.payroll;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
