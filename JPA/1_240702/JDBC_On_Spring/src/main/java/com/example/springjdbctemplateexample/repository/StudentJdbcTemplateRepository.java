package com.example.springjdbctemplateexample.repository;

import com.example.springjdbctemplateexample.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentJdbcTemplateRepository implements StudentRepository {

    JdbcTemplate jdbcTemplate;
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", (rs, rowNum) ->
                new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address")));
    }

    @Override
    public List<Student> findStudents(String name) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("name", name);
        return namedParameterJdbcTemplate.query("select * from students where name = :name",
                mapSqlParameterSource,
                (rs, rowNum) -> new Student(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("age"), rs.getString("address")));
    }

    @Override
    public int insertStudent(Student student) {
        return jdbcTemplate.update(
                "INSERT INTO students(name, age, address) VALUES (?, ?, ?)",
                student.getName(), student.getAge(), student.getAddress());
    }
}
