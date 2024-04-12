package com.chainsys.day3;

import java.util.Scanner;
//Question13
public class Equation {

	public static void main(String[] args)
	{
//		2y2 + y + 5
		Scanner scanner = new Scanner(System.in);
		System.out.println("From");
		int From = scanner.nextInt();
		System.out.println("To");
		int To = scanner.nextInt();
		
		for(int i=From; i<=To; i+=1)
		{
			int Result = 2 * i * i + i + 5;
			System.out.println(Result);
		}
	}
}
