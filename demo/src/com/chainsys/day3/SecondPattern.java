package com.chainsys.day3;

import java.util.Scanner;
//Question15(b)
public class SecondPattern {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Number = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Number))
		{
			for(int i=1; i<Number; i+=2)
			{
				for(int j=i; j<=Number; j+=1)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i; j+=1)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1; i<=Number; i+=2)
			{
				for(int j=1; j<=i; j+=1)
				{
					System.out.print(" ");
				}
				for(int j=i; j<=Number; j+=1)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}
