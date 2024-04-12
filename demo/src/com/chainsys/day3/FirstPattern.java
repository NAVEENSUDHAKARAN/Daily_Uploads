package com.chainsys.day3;

import java.util.Scanner;
//Question15(a)
public class FirstPattern {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Number = scanner.nextInt();
		
			ValidationChecker Check = new ValidationChecker();
			
			while(Number < 0)
			{
				System.out.print("Invalid Data Enter The Number Again : ");
				
				Number = scanner.nextInt();
			}
			
			for(int i=1; i<=Number; i+=1)
			{
				for(int j=1; j<=i; j+=1)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
}
