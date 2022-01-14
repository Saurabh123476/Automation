package com_practice_testing.com.testing;

public class revstrin {

	public static void main(String[] args) {
       String str = "123";
       System.out.println(reverse(str));

		}
	public static String reverse(String in) {
		
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length-1;i>=0; i--) 
			out.append(chars[i]);
		
		
		return out.toString();
		
	}
}


