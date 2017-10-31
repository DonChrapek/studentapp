package studentapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();  
		
		System.out.println("Enter student class level (1-4): ");
		this.year = Integer.parseInt(in.nextLine());
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + year + ", ID: " + studentID);
	}
	
	// Generate ID
	private void setStudentID() {
		id++;
		this.studentID =  year + "" + id;
	}
	
	// Enroll in courses
	
	// View balance
	
	// Pay Tuition
	
	public String getName() {
		return "Name: " + this.firstName + " " + this.lastName;
	}
}
