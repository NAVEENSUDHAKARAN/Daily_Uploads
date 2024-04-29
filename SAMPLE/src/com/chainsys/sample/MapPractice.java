package com.chainsys.sample;

import java.util.HashMap;

public class MapPractice {

	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "Naveen");
		hm.put(2, "Saravana");
		hm.put(3, "Akash");
		hm.put(4, "Harish");
		hm.put(5, "Naveen");
		hm.put(6, "Rakesh");
		
		System.out.println(hm.get(5));
		System.out.println("HashMap : " + hm);
		
		
	}
}
