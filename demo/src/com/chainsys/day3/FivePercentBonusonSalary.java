package com.chainsys.day3;
//Question4
import java.util.Scanner;

public class FivePercentBonusonSalary {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		int Salary = scanner.nextInt();
		System.out.println("Experience in Years : ");
		int Experience = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Salary))
		{
			if(Check.Numerics(Experience))
			{
				if(Experience > 5)
				{
					int BonusAmount = (Salary / 10)/2;
					int UpdatedSalary = Salary + BonusAmount;
					System.out.println("The Updated Salary is : "  + UpdatedSalary);
				}
				else
				{
					System.out.println(Salary);
				}
			}
		}
		
		
	}
}
