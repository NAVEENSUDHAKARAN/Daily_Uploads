package com.chainsys.day8;

import java.util.Scanner;

import com.chainsys.day7.oop.ValidationChecker;

public class Profile {

	public static void main(String[] args) {
	
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		ValidationChecker check = new ValidationChecker();
		
		System.out.println("Enter the Name : ");
		student.name = scan.next();
		while(!check.str(student.name))
		{
			System.out.println("Invalid Name\nEnter Your Name Again : ");
			student.name = scan.next();
		}
		
		System.out.println("Enter the Age : ");
		student.age = scan.nextInt();
		while(!check.Numerics(student.age))
		{
			System.out.println("Invalid Name\nEnter Your Age Again : ");
			student.age = scan.nextInt();
		}
		
		System.out.println("Enter the Location : ");
		student.location = scan.next();
		while(!check.str(student.location))
		{
			System.out.println("Invalid Name\nEnter Your Location Again : ");
			student.location = scan.next();
		}
		
		System.out.println("Enter the Phone Number : ");
		student.phoneNumber = scan.nextInt();
		while(!check.Numerics(student.phoneNumber))
		{
			System.out.println("Invalid Name\nEnter Your Phone Number Again : ");
			student.phoneNumber = scan.nextInt();
		}
		
		System.out.println("Enter Tamil Mark : ");
		student.tamil = scan.nextInt();
		
		System.out.println("Enter English Mark : ");
		student.english = scan.nextInt();
		
		System.out.println("Enter Maths Mark : ");
		student.maths = scan.nextInt();
		
		student.marks();
		student.printDetails();
		
		scan.close();
	}
}
