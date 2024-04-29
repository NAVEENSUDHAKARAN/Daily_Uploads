package com.chainsys.sample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<String> user = new ArrayList<>();
		ArrayList<Integer> pass = new ArrayList<>();
		
		System.out.println("Enter Input To Store : ");
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i+=1)
		{
			user.add(scanner.next());
		}
		
//		System.out.println("Enter Password To Store : ");
//		for(int i=0; i<5; i+=1)
//		{
//			pass.add(scanner.nextInt());
//		}
		
		System.out.println("---LoggIN---");
		System.out.println("Enter UserName : ");
		String userName = scanner.next();

			while(user.contains(userName))
			{
				System.out.println("LoggedIN\nWelcome : " + userName);
				break;
			}

		
	}
	
}
