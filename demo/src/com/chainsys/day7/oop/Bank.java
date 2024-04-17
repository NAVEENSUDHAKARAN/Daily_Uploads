package com.chainsys.day7.oop;

public class Bank {

	double interestRate;
	int amount;
	int balance=10000;
	BankPojo bp = new BankPojo();
	
	public void deposit(String bankName, int balanace, int amount) {
		balance = balance + amount;
		System.out.println("Balance : " + balance );
	}
	
	
	public  void details(int bankId, String bankName) {
		this.bp.bankId = bankId;
		this.bp.bankName=bankName;
		
		System.out.println("BankID : " + bp.getBankId());
		System.out.println("Bank Name : " + bp.getBankName());
	}

	public void details(String bankName, String bankLocation) {
	
		
		System.out.println("Bank Name : " + bp.getBankName());
		System.out.println("Bank Location : " + bp.getBankLocation());
	}

	int userid;

	long accountNo;
	int age;
	
	public void getUserDetails(int id, String name) {
		this.userid = id;
		this.bp.userName = name;
		
		System.out.println("User ID : " + id);
		System.out.println("User Name : " + name);
	}
	
	public void getUserDetails(String name, long accNo) {
		this.bp.userName = name;
		this.accountNo = accNo;
		
		System.out.println("User Name : " + name);
		System.out.println("Account Number : " + accNo);
	}
	
	public void printUserDetails()
	{
		getUserDetails(bp.userName, accountNo);
		
	}
	
	
}
