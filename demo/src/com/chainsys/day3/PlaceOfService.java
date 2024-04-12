package com.chainsys.day3;
//Question7
import java.util.Scanner;

public class PlaceOfService {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Age;

		System.out.println("Enter The Age : ");
		Age = scanner.nextInt();
		System.out.println("Enter The Gender M/F : ");
		String Gender = scanner.next();
		System.out.println("Enter Marital Status Y/N : ");
		char MS = scanner.next().charAt(0);

		ValidationChecker Check = new ValidationChecker();
		while (Age < 0) {
			System.out.print("Invalid Data\nEnter The Age Again : ");
			Age = scanner.nextInt();
		}

		//if (Gender.equalsIgnoreCase("M") && Gender.equalsIgnoreCase("F") && MS != 'Y' && MS != 'N') {
			if (Gender.equalsIgnoreCase("F")) {
				System.out.println("Should Work Only in Urban Places!");
			} else if (Gender.equalsIgnoreCase("M") && (Age >= 20 && Age <= 40)) {
				System.out.println("Can Work AnyWhere");
			} else if (Gender.equalsIgnoreCase("M") && (Age >= 40 && Age <= 60)) {
				System.out.println("Should Work Only in Urban Places!!");
			} else {
				System.out.println("ERROR");
			}
	
		

	}
}
