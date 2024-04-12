package com.chainsys.day2;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args)
	{
		int mark;
		
		System.out.print("Enter the Mark : ");
		Scanner scanner = new Scanner(System.in);
		mark = scanner.nextInt();
		
		if(mark >= 91 && mark <= 100)
		{
			System.out.println("A Grade");
		}
		else if(mark >= 81 && mark <= 90)
		{
			System.out.println("B Grade");
		}
		else if(mark >= 71 && mark <= 80)
		{
			System.out.println("C Grade");
		}
		else if(mark >= 61 && mark <= 70)
		{
			System.out.println("D Grade");
		}
		else if(mark >= 51 && mark <= 60)
		{
			System.out.println("E Grade");
		}
		else if(mark == 50 || mark < 50)
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Zero");
		}
	}
}
