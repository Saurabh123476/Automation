package com_practice_testing.com.testing;

public class Strinrevdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="rewq";
		System.out.println(reverse(s));

	}

	private static String reverse(String s) {
		
		StringBuilder out  = new StringBuilder();
		
		char[] chars = s.toCharArray();
		for (int i=chars.length-1; i>=0; i--) 
			
		out.append(chars[i]);
		
		
		return out.toString();
	}
	

}
