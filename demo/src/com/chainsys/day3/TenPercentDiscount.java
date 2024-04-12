package com.chainsys.day3;
//Question3
import java.util.Scanner;

public class TenPercentDiscount {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Units to be Purchased : ");
		int Units = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Units))
		{
			if(Units * 100 >= 1000)
			{
				int Discount = (Units * 100) / 10;
				int Amount = (Units * 100) - Discount;
				System.out.println("The Total Amount After Discount is : " + Amount);
			}
			else
			{
				System.out.println(Units * 100);
			}
		}
	}
}
