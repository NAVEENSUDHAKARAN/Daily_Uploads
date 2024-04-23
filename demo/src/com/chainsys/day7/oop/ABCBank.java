package com.chainsys.day7.oop;

import java.util.Random;
import java.util.Scanner;

public class ABCBank {

	public static void main(String[] args) {
		Scanner ABCBank = new Scanner(System.in);
		Random random = new Random();
		bk b = new bk();
		
		String accPattern = "1234567890123456";
		Bank bank = new Bank();
		BankPojo bp = new BankPojo();
		
		ValidationChecker check = new ValidationChecker();

		System.out.println("Enter the Amount to Deposit : ");
		bank.amount = ABCBank.nextInt();
		while (!check.Numerics(bank.amount)) {
			System.out.println("Invalid Data\nEnter the Amount again : ");
			bank.amount = ABCBank.nextInt();
		}
		
		System.out.println("Enter The Bank Name : ");
		bp.setBankName(ABCBank.next());
		while(!check.str(bp.getBankName()))
		{
			System.out.println("Invalid Data\nEnter the Bank Name again : ");
			bp.setBankName(ABCBank.next());
		}
		
		System.out.println("Enter Bank ID : ");
		bp.setBankId(ABCBank.nextInt());
		while(!check.Numerics(bp.bankId))
		{
			System.out.println("Invalid data\nEnter The Bank ID Again : ");
			bp.setBankId(ABCBank.nextInt());
		}
		
		System.out.println("Enter the Phone Number  : ");
		bp.setPhoneNumber(ABCBank.nextLong());
		
		while(bp.getPhoneNumber() < 0)
		{
			System.out.println("invalid Data\nEnter The Phone Number Again : ");
			bp.setPhoneNumber(ABCBank.nextLong());
		}
		
		System.out.println("\n------------------------------------------");
		System.out.println("The Total Amount is : ");
		bank.deposit(bank.bp.bankName, bank.balance, bank.amount);
		System.out.println("The Bank Name is : " + bp.getBankName());
		System.out.println("The Bank ID is : " + bp.getBankId());
		System.out.println("Your Phone Number : " + bp.getPhoneNumber());
		System.out.print("Your Account Number is : 0001");
		for(int i=0; i<10; i+=1)
		{
			System.out.print(random.nextInt(accPattern.length()));
		}
		System.out.println("\nThe Interest Amount 2% is : " + b.interest(bank.amount));
		
		System.out.println("Would You Like To WithDraw The Amount (Y or N) : ");
		String ch = ABCBank.next();
		if(ch.toLowerCase().equals("y"))
		{
			System.out.println("Enter The Amount to WithDraw : ");
			int withDrawAmount = ABCBank.nextInt();
			
			System.out.println("The Available Balance is : " + b.withDraw(withDrawAmount));
		}
		
		System.out.println("\n------------------------------------------");

		b.display();
		if(10 > 5)
		{
			System.out.println(b.add());
		}
		
		ABCBank.close();
	}
}
