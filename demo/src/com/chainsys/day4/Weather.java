package com.chainsys.day4;

import java.util.Scanner;
//Question14
public class Weather {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is it Raining Y or N : ");
		String ch = scanner.next();
		
		while(!ch.equals("Y") && !ch.equals("N") && !ch.equals("y") && !ch.equals("n"))
		{
			System.out.println(ch);
			System.out.print("Invalid Data\nEnter The Input Again : ");
			ch = scanner.next();
		}
		
		if(ch.equalsIgnoreCase("Y") || ch.equalsIgnoreCase("N"))
		{
			
			if(ch.equalsIgnoreCase("Y"))
			{
				System.out.println("Get an Umbrella!!!\nEnter The Degree : ");
				int Degree = scanner.nextInt();
				
				while(Degree < 0)
				{
					System.out.print("Invalid Data\nEnter The Degree Again : ");
					Degree = scanner.nextInt();
				}
				if(Degree < 32)
				{
					System.out.println("Bring a Light Jacket");
				}
				else if(Degree >= 33 && Degree <= 50)
				{
					System.out.println("Bring a Heavy Jacket");
				}
				else
				{
					System.out.println("Don't Go Outside");
				}
			}
			else
			{
				System.out.println("No Jacket Needed!!!");
			}
		}
		
	}
}
