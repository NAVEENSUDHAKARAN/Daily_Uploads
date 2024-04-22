package com.chainsys.programmingchallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	static boolean isPangram(String str) {
		
		String match = "abcdefghijklmnopqrstuvwxyz";
		
		String[] s = str.split(" ");
		String noSpace = s.toString().toLowerCase();
		String join = noSpace.join("", s);
		char[] ch = join.toCharArray();
		char[] mat = match.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(ch);
		if(Arrays.equals(ch, mat))
		{
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		System.out.println(isPangram(str));
	}
}
