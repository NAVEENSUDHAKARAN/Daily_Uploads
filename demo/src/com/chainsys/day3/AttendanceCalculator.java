package com.chainsys.day3;
//Question5
import java.util.Scanner;

public class AttendanceCalculator {

	public static void main(String[] args)
	{
		Scanner AttendanceCalculator = new Scanner(System.in);
		System.out.print("Enter Number of Classes Held : ");
		double ClassesHeld = AttendanceCalculator.nextDouble();
		System.out.print("Enter Number of Classes Attended : ");
		double ClassesAttended = AttendanceCalculator.nextDouble();
		System.out.print("Medical Cause (Y or N) : ");
		char MC = AttendanceCalculator.next().charAt(0);
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Doubles(ClassesHeld))
		{
			if(Check.Doubles(ClassesAttended))
			{
				double Safe = (ClassesHeld / 2);
				double LeavePercentage = Safe + (Safe / 2);
				double Percentage = (ClassesAttended / ClassesHeld) * 100;
				
				if(ClassesAttended > LeavePercentage)
				{
					System.out.println("Attendance percentage : " + Percentage + "%");
					System.out.println("Permitted to Attend the Exam!!!");
				}
				else if((ClassesAttended < LeavePercentage) && (MC == 'Y'))
				{
					System.out.println("Attendance percentage : " + Percentage + "%");
					System.out.println("Permitted to Attend the Exam");
				}
				else
				{
					System.out.println("Attendance percentage : " + Percentage + "%");
					System.out.println("Not Permitted to Attend the Exam");
				}
			}
			
				
		}

		
		
	}
}
