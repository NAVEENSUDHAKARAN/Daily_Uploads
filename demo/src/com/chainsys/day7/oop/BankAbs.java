package com.chainsys.day7.oop;

public abstract class BankAbs implements BankInterface {

	@Override
	public void display() {
		System.out.println("Displayed!!!");
		
	}
	
	public abstract void bankName();
	
}

class bk extends BankAbs{

	@Override
	public void bankName() {
		
		System.out.println("asdfghj");
	}
	
}