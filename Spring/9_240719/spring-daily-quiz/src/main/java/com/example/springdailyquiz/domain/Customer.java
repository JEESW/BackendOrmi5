package com.example.springdailyquiz.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
    private String address;
}