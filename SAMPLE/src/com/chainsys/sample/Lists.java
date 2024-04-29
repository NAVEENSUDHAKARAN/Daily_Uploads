package com.chainsys.sample;

import java.util.LinkedList;


public class Lists {

	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList<>();
		
		list1.add("Naveen");
		list1.add(22);
		list1.add('c');
		
		list2.add(23);
		list2.add('a');
		list2.add(0,"Navi");
		list2.set(2, "12345678");
		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);
		list1.addAll(0,list2);
		
		
		System.out.println("List1 add List2 : " + list1);
		
		System.out.println(list1.contains("Naveen"));
		
		
	}
}
