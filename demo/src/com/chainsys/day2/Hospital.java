package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {
	
	public static void main(String[] args) {
		String HospitalName;
		String ChiefDoctorName;
		int NumberofDoctors;
		int NumberOfSeats;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Hosplital Name : ");
		HospitalName = sc.nextLine();
		System.out.println("Enter The Doctor Name : ");
		ChiefDoctorName = sc.next();
		System.out.println("Enter The Number of Doctors : ");
		NumberofDoctors = sc.nextInt();
		System.out.println("Enter Number of Seats : ");
		NumberOfSeats = sc.nextInt();
		
		System.out.println("The Hospital Name is : " + HospitalName + "\n" +"The CheifDoctor is : " + ChiefDoctorName + "\n"+"Total number of Doctors are : " + NumberofDoctors + "\n"+"Total number of seats are : " + NumberOfSeats);
		
		
		
		
		
	}
}
