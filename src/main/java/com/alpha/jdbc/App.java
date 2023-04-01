package com.alpha.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("My program is running");
		// SPRING JDBC TEMPLATE
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alpha/jdbc/config.xml");
		JdbcTemplate dbTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

		// INSERT QUERY
		String query = "insert into student(id, name, city) values(?, ?, ?)";

		// EXECUTE QUERY
		Integer result = dbTemplate.update(query, 102, "Zahid", "GZI");

		System.out.println("Numbe of record inserted .." + result);

	}
}
