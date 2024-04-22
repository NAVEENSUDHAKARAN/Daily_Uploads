package com.chainsys.programmingchallenges;

import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ValidationChecker check = new ValidationChecker();
		
		System.out.println("Enter The Sentence : ");
		String str = scanner.nextLine();
	

		System.out.println("Enter The Word To Search : ");
		String wordSearch = scanner.next();
		while(!check.str(wordSearch))
		{
			System.out.println("Invalid Data\nEnter the Word Again : ");
			str = scanner.nextLine();
		}
		
		int count = 0;

		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i += 1) {
			if (strArr[i].contains(wordSearch) == true) {
				count += 1;
			}
		}
		System.out.println("Count : " + count);

		scanner.close();
	}
}
