package com.nit.practice.resouces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.practice.beans.Book;
import com.nit.practice.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public Book book() {
		Book book=new Book();
		book.setId(101);
		book.setBookame("java");
		book.setAuthor("James");
		book.setId(101);
		return book;
	}
	@Bean(name="student")
	public Student std() {
		Student std=new Student();
		std.setId(1);
		std.setStudentname("Nitesh Kushwaha");
		return std;
		//When we return like this Then we should create Contructer in Pojo Class
		//return new Student(102,"Nitesh Kushwaha");
	}
}
