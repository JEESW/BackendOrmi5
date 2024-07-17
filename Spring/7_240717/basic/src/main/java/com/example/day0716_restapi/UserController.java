package com.example.day0716_restapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @GetMapping
  public List<User> getAllUsers() {
    return null;
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    return null;
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable("id") Long id) {
    return null;
  }

  @PutMapping("/{id}")
  public User updateUser(@PathVariable("id") Long id, @RequestBody User updateUser) {
    return null;
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable("id") Long id) {}
}