package com.chainsys.CabBooking;

import java.util.Scanner;

public class CabFare {

	public static void main(String[] args)
	{
		Scanner CabFare = new Scanner(System.in);
		CabType CT = new CabType();
		String namePattern = "^[A-Za-z]+$";

		System.out.println("Enter Your Name : ");
		String name = CabFare.next();
		
		while(!name.matches(namePattern))
		{
			System.out.println("Invalid UserName\nName should only Alphabets : ");
			name = CabFare.next();
		}
		
		System.out.println("Enter The KiloMeters : ");
		int km = CabFare.nextInt();
		while(km < 0)
		{
			System.out.print("Invalid Data\nRe-Enter the kilomoters : ");
			km = CabFare.nextInt();
		}
		
		System.out.println("Choose the cab type:\n* Micro ( Rs.10 per km )\n* Mini ( Rs.15 per km )\n* Prime (Rs.20 per km)");
		System.out.println("Enter The Cab Type : ");
		String cabType = CabFare.next().toLowerCase();
		
		while((!cabType.equalsIgnoreCase("Micro") && (!cabType.equalsIgnoreCase("Mini")) && (!cabType.equalsIgnoreCase("Prime"))))
		{
				System.out.print("Invalid Data\nRe-Enter the Cab type : ");
				cabType = CabFare.next().toLowerCase();
		}
			
		if(cabType.equalsIgnoreCase("Micro"))
		{
			int billAmount = CT.cabType(km, cabType);
			System.out.print("The Bill Amount for Micro Type is : " + CT.cabType(km, cabType));

			CT.discount(billAmount);
			
			System.out.println("\nDo You Want The Vehicle to Wait\nWaiting Charge is 1Rupee per minute (Y or N) :");
			String wait = CabFare.next();
			
			if(wait.toLowerCase().equals("y"))
			{
				System.out.println("Enter the Waiting Time in(Mins) : ");
				int waitTime = CabFare.nextInt();
				
				billAmount += CT.waitingCharge(waitTime);
				System.out.println("The Total Amount Including Waiting Charge is : " + billAmount);
			}
		}
		else if(cabType.equalsIgnoreCase("Mini"))
		{
			int billAmount = CT.cabType(km, cabType);
			System.out.print("The Bill Amount for Mini Type is : " + CT.cabType(km, cabType));
			CT.discount(billAmount);
			
			System.out.println("\nDo You Want The Vehicle to Wait\nWaiting Charge is 1Rupee per minute (Y or N) :");
			String wait = CabFare.next();
			
			if(wait.toLowerCase().equals("y"))
			{
				System.out.println("Enter the Waiting Time in(Mins) : ");
				int waitTime = CabFare.nextInt();
				
				billAmount += CT.waitingCharge(waitTime);
				System.out.println("The Total Amount Including Waiting Charge is : " + billAmount);
			}
		}
		else if(cabType.equalsIgnoreCase("Prime"))
		{
			int billAmount = CT.cabType(km, cabType);
			System.out.println("The Bill Amount for Prime Type is : " + CT.cabType(km, cabType));
			CT.discount(billAmount);

			System.out.println("\nDo You Want The Vehicle to Wait\nWaiting Charge is 1Rupee per minute (Y or N) :");
			String wait = CabFare.next();
			
			if(wait.toLowerCase().equals("y"))
			{
				System.out.println("Enter the Waiting Time in(Mins) : ");
				int waitTime = CabFare.nextInt();
				
				billAmount += CT.waitingCharge(waitTime);
				System.out.println("The Total Amount Including Waiting Charge is : " + billAmount);
			}
		}
		
		

		CabFare.close();
	}
	
	
}
