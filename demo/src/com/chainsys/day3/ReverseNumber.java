package com.chainsys.day3;

public class ReverseNumber {

	public int reverse(int num) {
		int rev = 0;
		while(num !=0)
		{
			int safe = num % 10;
			rev = rev * 10 + safe;
			num /= 10;
		}
		
		return rev;
	}
}
