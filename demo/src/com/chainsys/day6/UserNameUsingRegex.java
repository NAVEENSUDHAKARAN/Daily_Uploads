package com.chainsys.day6;

import java.util.Random;

public class UserNameUsingRegex {
	
	static String userNameGenerator(int n,String[] pattern) {
		StringBuilder strBuilder = new StringBuilder();
		Random random = new Random();
		while(strBuilder.length() < n)
		{
			for(String str : pattern)
			{
				char userName = (char)(random.nextInt(35,120)) ;
				if(Character.toString(userName).matches(str)) {
					strBuilder.append(userName);
				}
			}
	
		}
		return strBuilder.toString();
	}

	public static void main(String[] args)
	{
		String pattern[] = {"^[a-zA-Z0-9]+$","^[@]$","^[a-z]+$"};
		System.out.println(userNameGenerator(8,pattern)+(userNameGenerator(1,pattern))+(userNameGenerator(3,pattern))+(".com"));	
		}

}
