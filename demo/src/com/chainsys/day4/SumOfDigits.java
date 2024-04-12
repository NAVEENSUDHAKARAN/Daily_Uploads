package com.chainsys.day4;

import java.util.Scanner;
//Question18
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner SumOfDigits = new Scanner(System.in);
		System.out.print("Enter The Number to Add : ");
		int Number = SumOfDigits.nextInt();

		while (Number < 0) {
			System.out.println("Invalid Data\nEnter The Number Again : ");
			Number = SumOfDigits.nextInt();
		}

		SumOfDigits sod = new SumOfDigits();
		System.out.println(sod.Sum(Number));
	}

	public static int Sum(int num) {
		int Add = 0;

		while (num != 0) {
			int safe = num % 10;
			Add += safe;
			num /= 10;
		}

		//System.out.println(Add);
		return Add;
	}

}
