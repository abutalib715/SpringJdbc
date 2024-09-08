package com.alpha.jdbc.dao;

import com.alpha.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

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

}
