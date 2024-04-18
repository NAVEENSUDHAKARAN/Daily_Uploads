package com.chainsys.day7.oop;


import java.util.Scanner;
import java.util.regex.*;

public class Practice
{
	public static void main(String[] args) {
		
		String str1= "newt";
		String str2 = "new";
		
		System.out.println(str1.contains(str2));
	}

}



//public static void main(String[] args){
//	Scanner in = new Scanner(System.in);
//	int testCases = Integer.parseInt(in.nextLine());
//	String pat = "[A-Za-z0-9!@#$%^&*()]";
//    while(testCases>0){
//		String pattern = in.nextLine();
//        
//        Pattern pt = Pattern.compile(pat);
//      	//Write your code
//         Matcher matcher = pt.matcher(pattern);
//         
//         if(matcher.find())
//         {
//             System.out.println("Valid");
//         }
//         else
//         {
//             System.out.println("Invalid");
//         }
//          
//         in.close();
//	}
//}
