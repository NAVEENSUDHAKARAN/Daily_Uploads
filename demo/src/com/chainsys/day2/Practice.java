package com.chainsys.day2;

import java.util.Scanner;

public class Practice {

	static int num1, num2;
		
	public static void main(String[] args) {
		int sum = Add(10, 20);
		System.out.println("sum : " + sum);
		
		System.out.println("---------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		Practice.Sub();
	}
	
	public static int Add(int num1, int num2) {
		return  num1 + num2;
	}
	
	public static void  Sub() {
		System.out.println(num1 - num2);
	}
}
