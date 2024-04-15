package com.chainsys.day6;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args)
	{
		int[] num = {1,2,3,4,5};
		
		for(int n : num)
		{
			System.out.print(n + " ");
		}
		
		List<String> names = Arrays.asList("Naveen", "Ram", "Ravi");
		System.out.println("asList : " + names);
		System.out.println(Arrays.toString(num));
		
	}
}
