package com.chainsys.day3;

import java.util.Scanner;

public class ValidationChecker {
	
		public boolean Numerics(int Number) {
				if(Number < 0)
				{
					System.out.println("Invalid Data");
					return false;
				}
			return true;
		}
		
		public boolean Strings(String Str)
		{
			if(Str == "" || Str.length() < 2)
			{
				System.out.println("Insufficient Data");
				return false;
			}
			return true;
		}
		
		public boolean Doubles(double Number) {
			if(Number < 0)
			{
				System.out.println("Invalid Data");
				return false;
			}
			return true;
		}
	
}
