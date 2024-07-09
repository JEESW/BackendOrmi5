package com.example.day0709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

  @GetMapping("/index")
  public String index(Model model) {
      model.addAttribute("title", "으악새");
      model.addAttribute("name", "굿굿베리굿");
      model.addAttribute("str", "굵은 글씨");
      model.addAttribute("emContent", "링크다");

      return "index";
  }
}
