package com.alpha.jdbc.dao;

import com.alpha.jdbc.entities.Student;

public interface StudentDao {
	public Integer insert(Student student);
	public Integer update(Student student);
}
