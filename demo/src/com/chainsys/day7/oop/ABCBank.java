package com.chainsys.day7.oop;

import java.util.Scanner;

public class ABCBank {

	public static void main(String[] args) {
		Scanner ABCBank = new Scanner(System.in);

		int bankId = 12, userId = 111, balance = 10000;
		String bankName = "SBI", bankLocation = "Madurai", userName = "Naveen";
		double interestRate = 2000;
		long phoneNumber = 123456789;

		Bank bank = new Bank();
		ValidationChecker check = new ValidationChecker();

		System.out.println("Enter the Amount to Deposit : ");
		int amount = ABCBank.nextInt();

		while (!check.Numerics(amount)) {
			System.out.println("Invalid Data\nEnter the Amount again : ");
			amount = ABCBank.nextInt();
		}
		System.out.println("The Total Amount is : ");
		bank.deposit(bankName, balance, amount);

		bank.details(bankId, bankName);
		System.out.println("------------------------");

		bank.details(bankName, bankLocation);
		System.out.println("------------------------");

		bank.getUserDetails(userId, userName);
		System.out.println("------------------------");

		bank.printUserDetails();

	}
}
