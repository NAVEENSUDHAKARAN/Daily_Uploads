package com.chainsys.programmingchallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static boolean isAnagram(String str1, String str2) {
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Word : ");
		String str1 = scanner.next();
		System.out.println("Enter The Second Word : ");
		String str2 = scanner.next();
		
		System.out.println(isAnagram(str1, str2));
	}
}
