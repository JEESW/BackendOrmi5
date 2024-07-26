package com.example.springdailyquiz.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private String description;
}