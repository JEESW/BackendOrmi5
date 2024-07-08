package com.example.service;

import com.example.util.Helper;
import com.example.util.Test1;
import com.example.util.Test2;
import com.example.util.Test3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService {

    private final Helper helper;
    private final Test1 test1;
    private final Test2 test2;
    private final Test3 test3;

    public String hello() {
    System.out.println(this.helper);
        return "Hello";
    }
}
