package com.example.springdailyquiz.repository;

import com.example.springdailyquiz.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.store.id = :storeId AND o.orderDate BETWEEN :startDate AND :endDate")
    List<Order> findByStoreAndPeriod(@Param("storeId") Long storeId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}