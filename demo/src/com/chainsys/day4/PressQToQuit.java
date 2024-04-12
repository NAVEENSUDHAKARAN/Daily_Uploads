package com.chainsys.day4;

import java.util.ArrayList;
import java.util.Scanner;
//Question17
public class PressQToQuit {

	public static void main(String[] args)
	{
		Scanner PressQToQuit = new Scanner(System.in);
		System.out.print("Enter The Number : ");
	
		int product = 1;
		String inputPattern = "^[0-9]+$";
		while(PressQToQuit.hasNext())
		{
			String str = PressQToQuit.next();
			while(!str.equals("Q") && !str.equals("q") && !str.matches(inputPattern))
			{
				System.out.println("Invalid Data\nRe-Enter: ");
				 str = PressQToQuit.next();
			}
			
			if(str.matches(inputPattern))
			{
				product = product * Integer.parseInt(str);
			}
			else if(str.equals("Q") || str.equals("q"))
			{
				break;				
			}
	
			
		}
		System.out.println(product);
		
		
		
	}
}
