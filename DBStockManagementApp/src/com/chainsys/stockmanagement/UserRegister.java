package com.chainsys.stockmanagement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class UserRegister {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter The Number : ");
//		int num = scanner.nextInt();
//		if(num == 1)
//		{
//			write();
//		}
//		if(num == 2)
//		{
//			read();
//		}
//		
		
		
	}
	
	public static void write() {
		Scanner scanner = new  Scanner(System.in);
		try {

			System.out.println("<-----Register----->");

			System.out.println("Enter the UserName: ");
			String userName = scanner.next();
			System.out.println("Enter the Password : ");
			String password = scanner.next();
			
			

			FileWriter writer = new FileWriter("D:\\UserDetails.txt", true);
			String str = userName + " " + password + "\n";
			writer.write(str);
			
			writer.close();
			System.out.println("Registered Successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
		try {
			FileReader reader = new FileReader("D:\\UserDetails.txt");
			StringBuilder strBuilder = new StringBuilder();
			int num;
			char ch;
			while((num = reader.read()) != -1)
			{
				ch = (char) num;
				strBuilder.append(ch);
			}
			String[] str = strBuilder.toString().split(" ");
			for(int i=0; i<str.length; i+=1)
			{
				System.out.println(str[i]);
			}
						
					}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
