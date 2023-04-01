package com.alpha.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.alpha.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public Integer insert(Student student) {

		// INSERT QUERY
		String query = "insert into student(id, name, city) values(?, ?, ?)";
		
		Integer result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
