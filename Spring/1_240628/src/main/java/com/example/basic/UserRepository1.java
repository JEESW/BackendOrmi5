package com.example.basic;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository1 implements UserRepositoryInterface {
  @Override
  public void save(User user) {
    System.out.println("User saved");
  }

  @Override
  public void delete(User user) {
    System.out.println("User deleted");
  }
}
