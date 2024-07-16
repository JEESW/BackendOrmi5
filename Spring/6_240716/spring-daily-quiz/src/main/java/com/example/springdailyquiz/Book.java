package com.example.springdailyquiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    private long id;
    private String title;
    private String author;
    private int publicationYear;
}