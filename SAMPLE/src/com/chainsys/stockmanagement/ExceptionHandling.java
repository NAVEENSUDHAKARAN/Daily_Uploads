package com.chainsys.stockmanagement;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		try {
			System.out.println("Enter Number : ");
			int number = scanner.nextInt();
			
			System.out.println("The Number is : " + number);
		}
		catch(Exception e)
		{
			//System.err.println("Only integer allowed!");
			e.printStackTrace();
		}
		
	}
}
