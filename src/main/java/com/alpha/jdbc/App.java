package com.alpha.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alpha.jdbc.dao.StudentDao;
import com.alpha.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program is running");
		// SPRING JDBC TEMPLATE
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alpha/jdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student();
		student.setId(103);
		student.setName("Mainul");
		student.setCity("CTG");
		
		Integer result = studentDao.insert(student);
		
		System.out.println("Numbe of record inserted .." + result);

	}
}
