package com.chainsys.day2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		String Name;
		int RollNumber, RegisterNumber;
		String Branch, Department;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		Name = scanner.next();
		System.out.println("Enter the Roll Number : ");
		RollNumber = scanner.nextInt();
		System.out.println("Enter the Register Number : ");
		RegisterNumber = scanner.nextInt();
		System.out.println("Enter the Branch : ");
		Branch = scanner.next();
		System.out.println("Enter the Department : ");
		Department = scanner.next();
		
		System.out.println("The Name is : " + Name +"\n"+ "The Roll Number is : " +RollNumber+"\n"+ "The Register Number is : " + RegisterNumber+"\n"+ "The Branch is : " + Branch+"\n"+ "The Department is : " + Department);
	}
}
