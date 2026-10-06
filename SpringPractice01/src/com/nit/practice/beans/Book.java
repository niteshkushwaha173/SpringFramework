package com.nit.practice.beans;

public class Book {
private int id;
private String bookname;
private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookame() {
	return bookname;
}
public void setBookame(String name) {
	this.bookname = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public void display() {
	System.out.println("Book_ID= "+id);
	System.out.println("BookName= "+bookname);
	System.out.println("Book Author= "+author);
}
}
