package com.chainsys.day6;

import java.util.Random;

public class RandomMail {

	public static void main(String[] args)
	{
		Random random = new Random();
		String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		StringBuilder strBuilder = new StringBuilder();
		
		
		while(strBuilder.length() <= 10)
		{
			char userName = (char)pattern.charAt(random.nextInt(pattern.length())) ;
			strBuilder.append(userName);
		}
		
		System.out.println(strBuilder);
	}
}
