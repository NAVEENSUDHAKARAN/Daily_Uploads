package com.chainsys.day3;
//Question1
public class LogicalOperatorsinVariables {

	public static void main(String[] args) {
		int num1=10, num2=20;
		
//		/*The local variable num2 may not have been initialized*/
//		/*System.out.println("Num1 is Greater than num2 : " + (num1 > num2));
//		System.out.println("Num1 is Less than num2 : " + (num1 < num2));
//		System.out.println("Num1 is Greater than or Equalto num2 : " + (num1 >= num2));
//		System.out.println("Num1 is Less than or Equalto num2 : " + (num1 <= num2));
//		System.out.println("Num1 is Equal To num2 : " + (num1 == num2));*/
		
		if(num1 > num2)
		{
			System.out.println("Num1 is Greater than num2");
		}
		else if(num1 < num2)
		{
			System.out.println("Num1 is Less than num2");
		}
		else if(num1 >= num2)
		{
			System.out.println("Num1 is Greater than or Equalto num2");
		}
		else if(num1 <= num2)
		{
			System.out.println("Num1 is Less than or Equalto num2");
		}
		else if(num1 == num2)
		{
			System.out.println("Num1 is Equal To num2");
		}
		else
		{
			System.out.println("Thank You!");
		}
	}
}
