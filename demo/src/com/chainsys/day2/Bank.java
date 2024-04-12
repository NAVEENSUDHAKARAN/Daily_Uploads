package com.chainsys.day2;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args)
	{
		int AccountNo, Pincode;
		String Name, DOB, Address;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Account Number : ");
		AccountNo = scanner.nextInt();
		System.out.println("Enter Your Pincode : ");
		Pincode = scanner.nextInt();
		System.out.println("Enter your Name : ");
		Name = scanner.next();
		System.out.println("Enter your DOB : ");
		DOB = scanner.next();
		System.out.println("Enter your Address : ");
		Address = scanner.next();
		
		System.out.println("Name : " + Name + "\n"+"Account Number : " + AccountNo 
				+ "\n"+"Pincode : " + Pincode + "\n"+"DOB : " + DOB + "\n"+"Address : " + Address);
	}
}
 