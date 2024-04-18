package com.chainsys.day7.oop;

import java.util.Scanner;

public class TestStudentDetails {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		ValidationChecker check = new ValidationChecker();
		System.out.println("Enter Student ID : ");
		int id = scan.nextInt();
		while(!check.Numerics(id))
		{
			System.out.println("Invalid Data\nEnter the ID again : ");
			id = scan.nextInt();
		}
		
		System.out.println("Enter Student Name : ");
		String name = scan.next();
		while(!(check.str(name)))
		{
			System.out.println("Invalid Data\nEnter the Name again : ");
			name = scan.next();
		}
		
		System.out.println("Enter Student Age : ");
		int age = scan.nextInt();
		while(!check.Numerics(age))
		{
			System.out.println("Invalid Data\nEnter the Age again : ");
			age = scan.nextInt();
		}
		
		System.out.println("Is Student Present : ");
		boolean isPresent = scan.hasNextBoolean();
		StudentDetails details = new StudentDetails();
		
		
		details.setId(id);
		details.setName(name);
		details.setAge(age);
		details.setPresent(isPresent);
		System.out.println(details.toString());	
		
		scan.close();
	}
}
