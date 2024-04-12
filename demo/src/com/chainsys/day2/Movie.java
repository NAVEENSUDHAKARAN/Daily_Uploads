package com.chainsys.day2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		
		String Hero;
		String Heroine;
		String Comedian, Producer, Director, ReleasingPlatform;
		int RunTime;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Who is the Hero : ");
		Hero = scanner.next();
		System.out.println("Who is the Heroine : ");
		Heroine = scanner.next();
		System.out.println("Who is the Comedian : ");
		Comedian = scanner.next();
		System.out.println("Who is the Producer : ");
		Producer = scanner.next();
		System.out.println("Who is the Director : ");
		Director = scanner.next();
		System.out.println("Which is the Releasing PlatForm : ");
		ReleasingPlatform = scanner.next();
		System.out.println("What is the RunTime : ");
		RunTime = scanner.nextInt();
		
		System.out.println("The Hero is : " + Hero + "\n" +"The Heroine is : " + Heroine + "\n"
				+"The Comedian is : " + Comedian + "\n" +"The Producer is : " + Producer + "\n" 
				+"The Director is : " + Director + "\n" +"The Releasing Platform is : " + ReleasingPlatform + "\n" +"The RunTime in Hour is : " + RunTime);
	}
}
