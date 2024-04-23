package com.chainsys.day7.oop;

public abstract class BankAbs implements BankInterface {

	@Override
	public void display() {
		System.out.println("Displayed!!!");
		
	}
	
	public abstract int interest(int num);
	
	public int withDraw(int num) {
		int balance = 10000;
		
		
		return balance - num;
	}
	
}

class bk extends BankAbs{

	@Override
	public int interest(int num) {
		
		num *= 0.2;
		
		return num;
	}
	
	public int add()
	{
		int a =5;
		int b = a*5;
		
		return b;
	}
	
}