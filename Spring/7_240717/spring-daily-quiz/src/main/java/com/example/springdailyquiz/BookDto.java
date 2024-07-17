package com.example.springdailyquiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDto {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int publishedYear;
}