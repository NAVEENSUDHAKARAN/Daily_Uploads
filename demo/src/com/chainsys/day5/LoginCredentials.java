package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.Pattern;
//Question12
public class LoginCredentials {

	public static void main(String[] args) {
		System.out.println(
				"Mail Address Must have @ and .\nPassword Must have :\n*One Capital Letter.\n*One Small Letter.\n*One Integer and One Special Character.\n*The Password Size should be More Than 7.\n");
		Scanner RegularExpression = new Scanner(System.in);
		System.out.println("Enter Your Mail Address : ");
		String userName = RegularExpression.next();
		System.out.println("Enter PassWord : ");
		String password = RegularExpression.next();

		String emailPattern = "^[a-z0-9]+@[A-Za-z]+\\.[a-z]+{5,}$";
		String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()])(?=.*\\d).{7,}$";
		
		while (!(userName.matches(emailPattern))) 
		{
			System.out.println("Weak UserName\nEnter The Mail Address Again : ");
			userName = RegularExpression.next();
		}

		while (!(password.matches(passwordPattern))) 
		{
			System.out.println("Weak Password\nEnter The Password Again : ");
			password = RegularExpression.next();
		}

		if (userName.matches(emailPattern) && password.matches(passwordPattern)) 
		{
			System.out.println("LoggedIn Successfully!!!");
		} 
		else 
		{
			System.out.println("Need A Strong Username and Password");
		}

	}
}
