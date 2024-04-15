package com.hackerrank.practice;

import java.util.Scanner;

public class Anagrams {
    
	public static boolean Sorting(String a, String b)
	{
		 char[] ch1 = a.toCharArray();
	        char[] ch2 = b.toCharArray();
	        if(a.length() == b.length()){
	            for(int i = 0;i<ch1.length;i++){
	            	for(int j = i+1 ;j<=ch1.length -1;j++) {
	            	      if(ch1[i] > ch1[j]){
	                          char temp = ch1[i];
	                          ch1[i] = ch1[j];
	                          ch1[j] = temp;  
	                      }
	            	}
	          
	            }
	            for(int i = 0;i<ch2.length;i++){
	            	for(int j = i+1 ;j<=ch2.length -1;j++) {
	          	      if(ch2[i] > ch2[j]){
	                        char temp = ch2[i];
	                        ch2[i] = ch2[j];
	                        ch2[j] = temp;  
	                    }
	             
	            }
	           }
	            for(int i = 0;i<ch1.length;i++){
	                if(ch1[i] == ch2[i]){
	                    return true;
	                }
	                else{
	                    return false;
	                }
	            }      
	    }
		return false;
	}


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = Sorting(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}