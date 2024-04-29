package com.chainsys.sample;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		
		//The Set Will Remove The First Duplicate
		
		set.add("Naveen");//This one is Removed
		set.add("Navi");
		set.add("Saravana");
		set.add("Naveen");
		set.add("Akash");
		System.out.println("Set : " + set);
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(50);
		System.out.println("Set1 : " + set1);
		System.out.println("RetainALL : " + set1.retainAll(set1));
		System.out.println(set1.removeAll(set1));
		System.out.println("Set1 : " + set1);
	
		System.out.println("Set1 : " + set1);
		
	}
}
