package com.chainsys.day2;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the Operator : ");
		String op = scanner.next();
		switch(op)
		{
			case "+" :
				System.out.println(num1 + num2);
				break;
			case "-" :
				System.out.println(num1 - num2);
				break;
			case "/" :
				System.out.println(num1 / num2);
				break;
			case "*" :
				System.out.println(num1 * num2);
				break;
			case "%" :
				System.out.println("Remainder : " + num1 % num2);
				System.out.println("Quotient  : " + num1 / num2);
				break;
			default :
				System.out.println("Invalid");
		}
	}
}
