package com.chainsys.day2;

import java.util.Scanner;

public class Car {
	public static void main(String[] args)
	{
		String Brand;
		String Colour;
		int SeatCount;
		String VehicleType;
		String TransmissionType;
		boolean HasKeyLessEntry;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Car's Brand : ");
		Brand = scanner.next();
		System.out.println("Enter the Car's Colour : ");
		Colour = scanner.next();
		System.out.println("Enter the Car's Seat Count : ");
		SeatCount = scanner.nextInt();
		System.out.println("Enter the Car's Vehicle Type : ");
		VehicleType = scanner.next();
		System.out.println("Enter the Car's Transmission Type : ");
		TransmissionType = scanner.next();
		System.out.println("Enter the Car's Has Keyless Entry : ");
		HasKeyLessEntry = scanner.hasNext();
		
		System.out.println("Brand : " + Brand);
		System.out.println("Colour : " + Colour);
		System.out.println("Seat Count : " + SeatCount);
		System.out.println("Vehicle Type : " + VehicleType);
		System.out.println("Transmission Type : " + TransmissionType);
		System.out.println("Has KeyLess Entry : " + HasKeyLessEntry);
	}
}

