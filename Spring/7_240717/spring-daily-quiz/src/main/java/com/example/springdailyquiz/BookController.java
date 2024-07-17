package com.example.springdailyquiz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<Book> books = new ArrayList<>();
    private long nextId = 1;

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("id") Long id) {
        Book book =
                books.stream()
                        .filter(b -> b.getId() == id)
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("해당 도서가 없습니다!"));

        BookDto bookDto = convertToBookDto(book);
        return ResponseEntity.ok(bookDto);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDto> updateBook(@PathVariable("id") Long id, @RequestBody Book updateBook) {
        Book book =
                books.stream()
                        .filter(b -> b.getId() == id)
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("해당 도서가 없습니다!"));

        book.setTitle(updateBook.getTitle());
        book.setAuthor(updateBook.getAuthor());
        book.setPrice(updateBook.getPrice());
        book.setIsbn(updateBook.getIsbn());
        book.setPublishedYear(updateBook.getPublishedYear());

        BookDto bookDto = convertToBookDto(book);
        return ResponseEntity.ok(bookDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        books.removeIf(b -> b.getId() == id);
    }

    private BookDto convertToBookDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setPrice(book.getPrice());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setPublishedYear(book.getPublishedYear());
        return bookDto;
    }

    private static Book convertToBookEntity(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setPrice(bookDto.getPrice());
        book.setIsbn(bookDto.getIsbn());
        book.setPublishedYear(bookDto.getPublishedYear());
        return book;
    }
}