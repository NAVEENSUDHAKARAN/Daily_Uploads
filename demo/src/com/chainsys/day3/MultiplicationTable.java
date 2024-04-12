package com.chainsys.day3;

import java.util.Scanner;
//Question9
public class MultiplicationTable {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Table : ");
		int Table = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Table))
		{
			for(int i=1; i<=10; i+=1)
			{
				System.out.println(i + " X " + Table  + " = " + i * Table);
			}
		}
		
	}
}
