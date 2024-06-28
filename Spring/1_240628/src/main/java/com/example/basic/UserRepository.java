package com.example.basic;

import org.springframework.stereotype.Repository;

// Repository 어노테이션으로 IOC에 올림
@Repository
public class UserRepository implements UserRepositoryInterface {

  @Override
  public void save(User user) {
    System.out.println("User saved");
  }

  @Override
  public void delete(User user) {
    System.out.println("User deleted");
  }
}
