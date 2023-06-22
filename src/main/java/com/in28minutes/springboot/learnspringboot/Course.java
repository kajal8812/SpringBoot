package com.in28minutes.springboot.learnspringboot;

public class Course {

	private int sno;
	private String name;
	private String author;

	public Course(int sno, String name, String author) {
		super();
		this.sno = sno;
		this.name = name;
		this.author = author;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [sno=" + sno + ", name=" + name + ", author=" + author + "]";
	}

}
