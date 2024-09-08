package com.alpha.jdbc.dao;

import com.alpha.jdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();

        student.setId(resultSet.getInt(3));
        student.setName(resultSet.getString(1));
        student.setCity(resultSet.getString(2));

        return student;
    }
}
