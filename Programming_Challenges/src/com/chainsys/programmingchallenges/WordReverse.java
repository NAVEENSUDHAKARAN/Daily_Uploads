package com.chainsys.programmingchallenges;

import java.util.Scanner;

public class WordReverse {

	static void reverse(String str) {
		
		String[] strArr = str.split(" ");
		
		for(int i=strArr.length-1; i>=0; i-=1)
		{
			System.out.print(strArr[i] + " ");
		}
		
	}
	
	
	public static void main(String[] args)
	{
		StringBuilder strBuilder = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Sentence To be Reversed : ");
		
		strBuilder.append(scan.nextLine());
		
		String sentence = strBuilder.toString();
		
		reverse(sentence);
		
		scan.close();
	}
}
