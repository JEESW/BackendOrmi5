package com.example.springmybatis.repository;

import com.example.springmybatis.domain.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
// 마이바티스의 이전 .ibatis

@Mapper // mapper라고 선언
public interface StudentMapper {
    int countStudents();

    List<Students> findStudents(@Param("id") Long id); // select * from studentd where id=#{id}

    void saveStudent(Students students);
}