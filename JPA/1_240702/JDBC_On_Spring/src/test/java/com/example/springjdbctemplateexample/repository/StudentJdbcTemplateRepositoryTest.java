package com.example.springjdbctemplateexample.repository;

import com.example.springjdbctemplateexample.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentJdbcTemplateRepositoryTest {
    @Autowired
    @Qualifier("studentJdbcTemplateRepository")
    private StudentRepository studentRepository;

    @Test
    void insertTest() {
        Student student = new Student();
        student.setName("장이수");
        student.setAge(40);
        student.setAddress("제주도");
        studentRepository.insertStudent(student);
    }

    @Test
    void selectWhereTest() {
        List<Student> list = studentRepository.findStudents("한빛");
        for (Student student : list) {
            System.out.print(student.getId());
            System.out.print(student.getName());
            System.out.print(student.getAge());
            System.out.println(student.getAddress());
        }
    }

    @Test
    void selectTest() {
        List<Student> list = studentRepository.findAll();
        for (Student student : list) {
            System.out.print(student.getId());
            System.out.print(student.getName());
            System.out.print(student.getAge());
            System.out.println(student.getAddress());
        }
    }
}