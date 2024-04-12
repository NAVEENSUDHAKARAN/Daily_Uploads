package com.chainsys.day2;

import java.util.Scanner;

public class Book {
	public static void main(String[] args)
	{
		String BookName;
		String Author;
		int Number_of_Pages;
		String Jenre;
		boolean IsNewBook = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("BookName : ");
		BookName = scanner.next();
		System.out.println("Author : ");
		Author = scanner.next();
		System.out.println("Number of Pages : ");
		Number_of_Pages = scanner.nextInt();
		System.out.println("Jenre : ");
		Jenre = scanner.next();
		System.out.println("IsNewBook : ");
		IsNewBook = scanner.hasNext();
		
		System.out.println("Book Name is : " + BookName + "\n" +"Author is : " + Author + "\n" +"Number of pages are : " + Number_of_Pages + "\n" +"Jenre is : " + Jenre + "\n" +"Is New Book : " + IsNewBook);
	}
}
