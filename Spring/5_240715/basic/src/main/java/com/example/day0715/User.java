package com.example.day0715;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String email;
    private boolean admin;
    private boolean person;
}
