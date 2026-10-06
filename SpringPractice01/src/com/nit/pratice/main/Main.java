package com.nit.pratice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.practice.beans.Book;
import com.nit.practice.beans.Student;
import com.nit.practice.resouces.AppConfig;

public class Main {
public static void main(String[] main) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Book book=(Book)context.getBean("book");
	//System.out.println(book);//Print the Address of the object
	book.display();
	Student std=(Student)context.getBean("student");
	std.showStudent();
}
}
