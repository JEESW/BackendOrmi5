package com.example.springjdbctemplateexample.repository;

import com.example.springjdbctemplateexample.domain.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    List<Student> findStudents(String name);
    int insertStudent(Student student);
}
