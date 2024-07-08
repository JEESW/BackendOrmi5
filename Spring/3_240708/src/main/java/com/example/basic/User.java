//package com.example.basic;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AccessLevel;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Data
//public class User {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "id", nullable = false)
//  private Long id;
//
//  private String email;
//  private String name;
//  private int age;
//}