package com.example.springdailyquiz.repository;

import com.example.springdailyquiz.domain.OrderItem;
import com.example.springdailyquiz.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    @Query("SELECT oi.menu FROM OrderItem oi GROUP BY oi.menu ORDER BY COUNT(oi.menu.id) DESC")
    List<Menu> findTop3Menus();
}