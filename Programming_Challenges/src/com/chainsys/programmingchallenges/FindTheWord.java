package com.chainsys.programmingchallenges;

import java.util.Scanner;

public class FindTheWord {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String str = scan.nextLine();
		
		System.out.println("Enter the Index : ");
		int index = scan.nextInt();
		
		String[] strArr = str.split(" ");
		for(int i=1; i<strArr.length; i+=1)
		{
			if(i+1 == index)
			{
				System.out.println(strArr[i]);
			}
		}
		
		
	}
}
