package com.chainsys.day5;

import java.util.Scanner;

public class TeenNumberChecker {

	public static void main(String[] args)
	{
		Scanner TeenNumberChecker = new Scanner(System.in);
		System.out.print("Enter The Age : ");
		int age = TeenNumberChecker.nextInt();
		
		System.out.print("Enter The Age1 : ");
		int age1 = TeenNumberChecker.nextInt();
		System.out.print("Enter The Age2 : ");
		int age2= TeenNumberChecker.nextInt();
		System.out.print("Enter The Age3 : ");
		int age3 = TeenNumberChecker.nextInt();
		
		TeenNumberChecker check = new TeenNumberChecker();
		System.out.println(check.isTeen(age));
		System.out.println(check.hasTeen(age1, age2, age3));
	}
	
	public boolean isTeen(int num)
	{
		if(num >= 13 && num <= 19)
		{
			return true;
		}
		return false;
	}
	
	public boolean hasTeen(int num1, int num2, int num3)
	{
		if(num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19)
		{
			return true;
		}
		return false;
	}
}
