package com.nit.practice.beans;

public class Student {
private int id;
private String studentname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public void showStudent() {
	// TODO Auto-generated method stub
	System.out.println("Student_Id "+id);
	System.out.println("Student_Name "+studentname);
}

}
