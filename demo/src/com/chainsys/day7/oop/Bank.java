package com.chainsys.day7.oop;

public class Bank {

	int bankId;
	String bankName;
	String bankLocation;
	double interestRate;
	long phoneNumber;
	int amount;
	int balance=10000;
	
	public void deposit(String bankName, int balanace, int amount) {
		balance = balance + amount;
		System.out.println("Balance : " + balance + "\nBank Name : " +bankName);
	}
	
	public  void details(int bankId, String bankName) {
		this.bankId = bankId;
		this.bankName=bankName;
		
		System.out.println("BankID : " + bankId);
		System.out.println("Bank Name : " + bankName);
	}

	public void details(String bankName, String bankLocation) {
		this.bankName=bankName;
		this.bankLocation = bankLocation;
		
		System.out.println("Bank Name : " + bankName);
		System.out.println("Bank Location : " + bankLocation);
	}

	int userid;
	String userName;
	long accountNo;
	int age;
	
	public void getUserDetails(int id, String name) {
		this.userid = id;
		this.userName = name;
		
		System.out.println("User ID : " + id);
		System.out.println("User Name : " + name);
	}
	
	public void getUserDetails(String name, long accNo) {
		this.userName = name;
		this.accountNo = accNo;
		
		System.out.println("User Name : " + name);
		System.out.println("Account Number : " + accNo);
	}
	
	public void printUserDetails()
	{
		getUserDetails(userName, accountNo);
		
	}
	
	
}
