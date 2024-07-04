package com.example.springdatajpaexample.repository;

import com.example.springdatajpaexample.domain.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes, Long> {

}
