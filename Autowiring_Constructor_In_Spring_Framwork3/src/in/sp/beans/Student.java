
package in.sp.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private String name;
	private int id;
	private int rollno;
	private int marks;
	private Address address;
	public Student() { } 
	public Student(String name, int id, int rollno, int marks,Address address) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.marks = marks;
		this.address=address;
	}

	public void display() {
		System.out.println("Name:: " + name);
		System.out.println("id :: " + id);
		System.out.println("rollno:: " + rollno);
		System.out.println("marks:: " + marks);
		System.out.println("Address:: " + address);
	}
}
