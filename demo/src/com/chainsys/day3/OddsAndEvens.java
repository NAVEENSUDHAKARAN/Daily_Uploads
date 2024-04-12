package com.chainsys.day3;

import java.util.Scanner;
//Question10
public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Number = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Number))
		{
			int[] arr1 = new int[Number];
			int[] arr2 = new int[Number];
			
			for (int i = 0; i < Number; i += 1) {
				if (i % 2 == 0) {
					arr1[i] += i;
					System.out.println(i);
				}
				if (i % 2 == 1) {
					arr2[i] += i;
					System.out.println(i);
				}

			}

			System.out.println("The Cube of " + Number + " is : " + Number * Number * Number);
			System.out.println("Even");
			for (int i = 0; i < Number; i += 1) {
				if (arr2[i] != 0) {
					System.out.print(arr2[i]);
				}
			}

			System.out.println("\nOdd");
			for (int i = 0; i < Number; i += 1) {
				if (arr1[i] != 0) {
					System.out.print(arr1[i]);
				}
			}

		}	
	}
}
