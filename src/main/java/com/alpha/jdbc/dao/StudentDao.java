package com.alpha.jdbc.dao;

import com.alpha.jdbc.entities.Student;

import java.util.List;

public interface StudentDao {
	public Integer insert(Student student);
	public Integer update(Student student);
	public Integer delete(Integer studentId);
	public Student getStudent(Integer studentId);
	public List<Student> getAllStudents();
}
