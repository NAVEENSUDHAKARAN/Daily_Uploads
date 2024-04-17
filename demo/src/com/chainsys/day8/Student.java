package com.chainsys.day8;

public class Student extends Person{

	int english, tamil, maths;

	void marks() {
		int total = english + tamil + maths;
		System.out.println("The Total Mark is : " + total);
	}
	
}
