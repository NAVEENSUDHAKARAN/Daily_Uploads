package com.chainsys.day5;

public class StringMethods {

	public static void main(String[] args)
	{
		String str1 = "ABCD", str2 = "efghi";
		String str3 = "ABCD", str4 = "abcD";		
		String str5 = "efgefhi", str6 = "";
		char[] ch1 = {'N', 'A','V', 'E', 'E', 'N' };
		
		System.out.println("To LowerCase : " + str1.toLowerCase());
		System.out.println("To UpperCase : " + str2.toUpperCase());
		System.out.println("Concatenation : " + str1.concat(str2));
		System.out.println("CharAT : " + str1.charAt(1));
		System.out.println("Code Point : " + str1.codePointAt(1));
		System.out.println("Compare : " + str1.compareTo(str2));
		System.out.println("Compare : " + str1.compareTo(str3));
		System.out.println("Compare(Ignore Case) : " + str1.compareToIgnoreCase(str4));
		System.out.println("Formatted : " + str1.formatted(str2));
		System.out.println("Indent : " + str1.indent(2));
		System.out.println("Index : " + str1.indexOf("C"));
		System.out.println("Length : " + str1.length());
		System.out.println("Repeat : " + str1.repeat(2));
		System.out.println("Replace : " + str4.replace('C', 'e'));
		System.out.println("Replace All : " + str2.replaceAll("ehi", "hij"));
		System.out.println("Replace First : " + str5.replaceFirst("ef", "EF"));
		System.out.println("leading and trailing Strip : " + str1.strip());
		System.out.println("Strip Leading : " + str1.stripLeading());
		System.out.println("SubString : " + str1.substring(1));
		System.out.println("StartsWith : " + str1.startsWith(str4));
		System.out.println("StartsWith : " + str1.startsWith(str3));
		System.out.println("EndsWith : " + str1.endsWith(str3));
		System.out.println("Contains : " + str1.contains(str3));
		System.out.println("Equals : " + str1.equals(str4));
		System.out.println("Equals IgnoreCase : " + str1.equalsIgnoreCase(str4));
		System.out.println("Join : " + str1.join("-", "Lenovo", "ThinkPad"));
		System.out.println("IsEmpty : " + str1.isEmpty());
		System.out.println("IsBlank : " + str6.isBlank());
		
		System.out.println();
		StringBuilder StrBuilder = new StringBuilder();
		System.out.println("Append : " + StrBuilder.append(str1).append(str2));
		System.out.println("Reverse : " + StrBuilder.reverse());
		System.out.println("DeleteCharAt : " + StrBuilder.deleteCharAt(2));
		System.out.println(StrBuilder.insert(2, ch1));

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
