package com.chainsys.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.chainsys.test.TestStock;

public class ValidationChecker {
	
	Scanner scan = new Scanner(System.in);
	
	
		public boolean Numerics(int Number) {
				if(Number < 0)
				{
					return false;
				}
			return true;
		}
		
		public boolean str(String name)
		{
			String pattern= "^[A-Za-z]+$";
			
			if(name.matches(pattern))
			{
				return true;
			}
			else {
				return false;
			}
			
		}
		
		public boolean doubles(double dbl)
		{
			if(dbl < 0.0)
			{
				return false;
			}
			return true;
		}
		
		public boolean phoneNumber(String number)
		{
			String phoneNumberPattern = "[0-9]+$";
			if(number.matches(phoneNumberPattern) && number.length() == 10)
			{
				return true;
			}
			return false;
		}
		
		public int IoMismatch4() {
			while(true)
			{
				try {
					
					int type = scan.nextInt();
					if(type != 1 && type != 2 && type != 3 && type != 0) {
						System.err.println("Enter The Valid Number : ");
					}
					else {
						return type;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					scan.nextLine();	
				}
				
			}
						
		}
		
		
		public int IoMismatch3() {
			while(true)
			{
				try {
					
					int type = scan.nextInt();
					if(type != 1 && type != 2&& type != 3) {
						System.err.println("Enter The Valid Number : ");
					}
					else {
						return type;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					scan.nextLine();	
				}
				
			}
						
		}
		
		public int IoMismatch2() {
			while(true)
			{
				try {
					
					int type = scan.nextInt();
					if(type != 1 && type != 2&& type != 3) {
						System.err.println("Enter The Valid Number : ");
					}
					else {
						return type;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					scan.nextLine();	
				}
				
			}
						
		}
		
		public int IoMismatchDepartment() {
			while(true)
			{
				try {
					
					int type = scan.nextInt();
					if (type != 1 && type != 2 && type != 3 && type != 'q') {
						System.err.println("Enter The Valid Number : ");
					}
					else {
						return type;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					scan.nextLine();	
				}
				
			}
						
		}
		
		public int IoMismatchProductManagementOptions() {
			while(true)
			{
				try {
					
					int type = scan.nextInt();
					if(type != 1 && type != 2 && type != 3 && type != 4 && type != 5 && type != 6 && type != 7) {
						System.err.println("Enter The Valid Number : ");
					}
					else {
						return type;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					scan.nextLine();	
				}
				
			}
						
		}
}
