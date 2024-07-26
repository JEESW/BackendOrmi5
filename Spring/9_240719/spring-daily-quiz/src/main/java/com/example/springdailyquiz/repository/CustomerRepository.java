package com.example.springdailyquiz.repository;

import com.example.springdailyquiz.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}