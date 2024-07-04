package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
