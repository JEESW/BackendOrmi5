package com.example.springmybatis.controller;

import com.example.springmybatis.domain.Students;
import com.example.springmybatis.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudents();
    }

    @GetMapping("/students")
    public List<Students> getALLStudents(@RequestParam(required = false) Long id) {
        return studentService.getStudents(id);
    }

    @PostMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addStudent(@RequestBody Students students) {
        studentService.saveStudent(students);
        return "OK";
    }
}