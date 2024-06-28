package com.example.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

  @Value("${kakao.api.key}")
  private String name;

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton);
    System.out.println("==============================");
    System.out.println(singleton1);
    System.out.println("==============================");
    System.out.println(singleton2);

    SpringApplication.run(BasicApplication.class, args);
  }
}
