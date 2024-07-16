package com.example.springdailyquiz;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    User user = new User("abc", "abc@gmail.com", "123456", false);
    List<Product> products = new ArrayList<>();

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("products", products);
        return "table";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/index")
    private String savePost(@ModelAttribute User user) {
        this.user.setUsername(user.getUsername());
        this.user.setEmail(user.getEmail());
        this.user.setPassword(user.getPassword());
        System.out.println("이름: " + user.getUsername());
        System.out.println("이메일: " + user.getEmail());
        System.out.println("비밀번호: " + user.getPassword());
        return "redirect:/index";
    }
}