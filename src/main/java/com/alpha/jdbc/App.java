package com.alpha.jdbc;

import com.alpha.jdbc.config.JdbcConfig;
import com.alpha.jdbc.dao.StudentDao;
import com.alpha.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("My program is running");
        // SPRING JDBC TEMPLATE
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		//INSERT DATA
//		Student student = new Student();
//		student.setId(103);
//		student.setName("Mainul");
//		student.setCity("CTG");
//
//		Integer result = studentDao.insert(student);
//		
//		System.out.println("Number of record inserted .." + result);
//		

//		// UPDATE DATA
//		Student student = new Student();
//		student.setId(103);
//		student.setName("Khaled");
//		student.setCity("DHK");
//
//		Integer result = studentDao.update(student);
//
//		System.out.println("Number of record updated .." + result);

//		// DELETE DATA
//		Integer result = studentDao.delete(103);
//
//		System.out.println("Number of record deleted .." + result);

//		//GET DATA BY ID
//		Student student = studentDao.getStudent(103);
//		System.out.println(student);

        List<Student> students = studentDao.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
