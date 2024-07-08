//package com.example.basic;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//
//  boolean existsByEmail(String email);
//
//  @Query("select u from User u where u.email = ?1 and u.age = ?2")
//  User findByEmailAndAge(String email, int age);
//}
