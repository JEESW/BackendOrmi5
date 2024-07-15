package com.example.springdailyquiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public String bookList(Model model) {
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/form")
    public String newBookForm(Model model) {
        return "addBook";
    }

    @PostMapping
    public String saveBook(@ModelAttribute Book book) {
        book.setId(nextId++);
        book.setPublicationYear(LocalDateTime.now().getYear());
        books.add(book);
        return "redirect:/books";
    }
}