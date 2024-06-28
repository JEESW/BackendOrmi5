package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Service 어노테이션으로 IOC에 올림
@Service
public class UserService {

  private UserRepositoryInterface userRepository;

  // 구현체를 하나 사용할 때는 자동으로 Autowired가 붙은 것으로 취급함.
  //  @Autowired
  public UserService(@Qualifier("userRepository") UserRepositoryInterface userRepositorySave) {
    this.userRepository = userRepositorySave;
  }

  public void createUser(User user) {
    userRepository.save(user);
  }

  public void deleteUser(User user) {
    userRepository.delete(user);
  }
}
