package com.chainsys.day5;

import java.util.Scanner;

public class Tax {
	
	public static void TaxCalculator(int salary, int savings)
	{
		int slab0 = 0;
		double slab1 = savings * 0.1, slab2 =savings * 0.2, slab3= savings * 0.3;
		if(savings > 500000)
		{
			System.out.println("The Tax Amount is : " + (savings + slab0 + slab1 + slab2 + slab3));
		}
		else if(savings > 200000 && savings < 500000)
		{
			System.out.println("The Tax Amount is 1 " +  (savings + slab0 + slab1 + slab2));
		}
		else if(savings > 100000 && savings < 200000)
		{
			System.out.println("The Tax Amount is : " + (savings + slab0 + slab1));
		}
		else if(savings > 100000)
		{
			System.out.println("The Tax Amount is : " + (savings + slab0));
		}
		else if(savings <= 100000)
		{
			System.out.println("No Tax is Applied : " + savings);
		}
		else
		{
			System.out.println("Invalid Data");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner Tax = new Scanner(System.in);
		System.out.println("Enter the Gross Salary : ");
		int grossSalary = Tax.nextInt();
		System.out.println("Enter the Total Savings : ");
		int totalSavings = Tax.nextInt();	
		
		while(grossSalary < totalSavings)
		{
			System.out.println("The Savings Amount is Exceeding the Gross Salary\nEnter The Amount Again :");
			totalSavings = Tax.nextInt();
		}
		
		TaxCalculator(grossSalary, totalSavings);
		
	}
}
