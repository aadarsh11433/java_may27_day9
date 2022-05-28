package com.Problem1;

import java.util.Scanner;

public class Student {

	private  int roll;
	private String name;
	private int marks;
	private char grade;
	
	Student(){
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public void displayDetails(Student student) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name of the student");
		
		String name = sc.next();
		
		System.out.println("enter rollno. of the student");
		int rollno = sc.nextInt();
		
		System.out.println("enter marks(out of 600) of the student");
		int marks = sc.nextInt();
		
		char grade = calculateGrade(marks);
		
	     student.setName(name);
	     student.setRoll(rollno);
	     student.setMarks(marks);
	     student.setGrade(grade);
		
		String studentdetails = student.toString();
		
		System.out.println(studentdetails);
		
		
		
	}
	
	public String toString() {
	
	return "Name of the student is : "+this.name +"\n"+"roll no. of the student is : "+this.roll+"\n"
			+"Marks of the student is : "+this.marks+"\n"+"grade of the student is : "+this.grade;
	}
	
	private char calculateGrade( int marks) {
		
		
		if(marks >= 500)
			return 'A';
		
		else	if (marks < 500 && marks >= 400)
				return 'B';
		
		else
				return 'C';
		
		
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	public char getGrade() {
		return grade;
	}
    public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	/*
	 Override the toString() method to print all the details of Student class.
inside the displayDetails() method, create the Student class object by taking (roll, name,
marks ) from the user and call the calculateGrade() method to get the Grade of the
Student.

Create another class Demo in which create two Student objects, and invoke the
displayDetails(). It should also display the student grade. 
	 
	 */
	
	
}
