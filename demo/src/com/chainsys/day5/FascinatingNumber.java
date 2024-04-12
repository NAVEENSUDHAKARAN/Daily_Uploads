package com.chainsys.day5;

import java.util.Scanner;

import com.chainsys.day3.ValidationChecker;
//Question19
public class FascinatingNumber {

	public static void main(String[] args) {
		Scanner FascinatingNumber = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Number = FascinatingNumber.nextInt();
		boolean isRepeated = false;
		
		ValidationChecker VC = new ValidationChecker();
		while(Number < 0)
		{
			System.out.println("Invalid Data\nEnter the Number Again : ");
			Number = FascinatingNumber.nextInt();
		}

		int MulBy2 = Number * 2;
		int MulBy3 = Number * 3;

		StringBuilder StrBuilder = new StringBuilder();
		StrBuilder.append(Number).append(MulBy2).append(MulBy3);
		String str = StrBuilder.toString();
		char[] charArr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
				for (int j = i + 1; j < str.length(); j++) {
					if (currentChar == str.charAt(j)) {
					isRepeated = true;
					break;
					}
				}
		}
		if (isRepeated) {
			System.out.println("The Given Output is Not a Fascinating Number");
		} else {
			System.out.println("The Given Output is a Fascinating Number");
		}

	}
}
