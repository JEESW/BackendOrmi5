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
    public String newBookForm() {
        return "addBook";
    }

    @PostMapping
    public String saveBook(@ModelAttribute Book book) {
        book.setId(nextId++);
        book.setPublicationYear(LocalDateTime.now().getYear());
        books.add(book);
        return "redirect:/books";
    }

    @GetMapping("/editBook/{id}")
    public String ShowEditBookForm(@PathVariable("id") Long id, Model model) {
        Book book = findBookById(id);

        model.addAttribute("book", book);
        return "editBook";
    }

    @PostMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") Long id, @ModelAttribute Book udBook) {
        Book book = findBookById(id);
        updateBook(udBook, book);
        return "redirect:/books";
    }

    @PostMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        books.removeIf(b -> b.getId() == id);
        return "redirect:/books";
    }

    Book findBookById(Long id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }

    void updateBook(Book bookSource, Book bookDest) {
        bookDest.setTitle(bookSource.getTitle());
        bookDest.setAuthor(bookSource.getAuthor());
    }
}