package com.chainsys.programmingchallenges;

public class practice {
public static void main(String[] args) {
	
	String str = "The quick brown fox jumps over the lazy dog";
	
	String[] s = str.split(" ");
	String noSpace = s.toString().join("", s);
	
	System.out.println(noSpace);
}
}
