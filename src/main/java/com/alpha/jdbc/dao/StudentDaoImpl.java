package com.alpha.jdbc.dao;

import com.alpha.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer insert(Student student) {

        // INSERT QUERY
        String query = "insert into student(id, name, city) values(?, ?, ?)";

        Integer result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    public Integer update(Student student) {
        // UPDATE QUERY
        String query = "update student set name=?, city=? where id=?";

        Integer result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    public Integer delete(Integer studentId) {
        // UPDATE QUERY
        String query = "delete from student where id=?";

        Integer result = this.jdbcTemplate.update(query, studentId);
        return result;
    }

    public Student getStudent(Integer studentId) {
        // SELECT QUERY - SINGLE ROW
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student result = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return result;
    }

    public List<Student> getAllStudents() {
        // SELECT QUERY - MULTIPLE ROW
        String query = "select * from student";
        List<Student> results = this.jdbcTemplate.query(query, new RowMapperImpl());
        return results;
    }

}
