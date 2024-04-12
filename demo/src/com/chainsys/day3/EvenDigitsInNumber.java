package com.chainsys.day3;
//Question11
import java.util.Scanner;

public class EvenDigitsInNumber {

	public static void main(String[] main)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = scanner.nextInt();
		int safe=0;
		
		ValidationChecker Check = new ValidationChecker();
		ReverseNumber rn = new ReverseNumber();
		
		int Number = rn.reverse(Num);
		if(Check.Numerics(Number))
		{
			
			while(Number != 0)
			{
				safe = Number % 10;
				if(safe % 2 == 0)
				{
					System.out.println(safe);
				}
				Number /= 10;	
			}
		}
		
	}
}
