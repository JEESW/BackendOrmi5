package com.example.springdailyquiz.repository;

import com.example.springdailyquiz.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByCategory(String category);
}