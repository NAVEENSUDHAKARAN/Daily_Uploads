package com.chainsys.sample;

public class CharArray {
/*Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/
	
	public static void main(String[] args)
	{
		String str = "MCMXCIV";
		int result = 0;
		
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i+=1)
		{
			if(ch[i] == 'I')
			{
				result +=1;
			}
			if(ch[i] == 'L')
			{
				result += 50;
			}
			if(ch[i] == 'V')
			{
				result += 5;
			}
			if(ch[i] == 'M')
			{
				result += 1000;
			}
			if(ch[i] == 'C')
			{
				result += 100;
			}
			if(ch[i] == 'X')
			{
				result += 10;
			}
			if(ch[i] == 'D')
			{
				result += 500;
			}
			
			for(int j=i+1; j<ch.length; j+=1)
			{
				if(ch[i] == 'C' && ch[j] == 'M')
				{
					result -=100;
				}
				if(ch[i] == 'X' && ch[j] == 'C')
				{
					result -=10;
				}
				if(ch[i] == 'I' && ch[j] == 'V')
				{
					result -=4;
				}
			}
		}
		
		System.out.println("Result : " + result);
	}
}
