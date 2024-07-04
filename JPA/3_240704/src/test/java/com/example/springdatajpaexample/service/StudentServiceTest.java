package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Classes;
import com.example.springdatajpaexample.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest() {
        Students student = new Students("오오오", 20, "독도");
        studentService.insertStudent(student);
    }

    @Test
    public void findAllTest() {
        List<Students> students = studentService.selectAllStudents();
        for (Students student : students) {
            System.out.print(student.getId());
            System.out.println(student.getName());
        }
    }

    /**
     * 연관관계 매핑 후 테스트 돌려보기
     */
    @Test
    public void findAllClassesTest() {
        List<Classes> list = studentService.selectAllClasses();
        for (Classes classes : list) {
            System.out.print(classes.getId());
            System.out.print(classes.getClassName());

            Students student = classes.getStudent();
            System.out.print(student.getId());
            System.out.print(student.getName());
            System.out.println(student.getAddress());
        }
    }
}