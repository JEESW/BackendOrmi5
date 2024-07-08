package com.example.basic;

import com.example.service.MyService;
import com.example.util.Helper;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.IOException;

@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class BasicApplication {
  public static void main(String[] args) throws ServletException, IOException {
    DispatcherServlet dispatcherServlet = new DispatcherServlet();
    String url = "/hello";

    MockHttpServletRequest request = new MockHttpServletRequest(url);
    MockHttpServletResponse response = new MockHttpServletResponse();

    dispatcherServlet.service(request, response);

    System.out.println(response.getContent());
    System.out.println("응답 내용: " + response.getContent());

    //    MyService myService = new MyService();
    //    myService.hello();

    SpringApplication.run(BasicApplication.class, args);
  }
}
