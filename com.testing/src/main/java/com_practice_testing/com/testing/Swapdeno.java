package com_practice_testing.com.testing;

public class Swapdeno {
	
	public static void swapnumber(int a,int b) {
		b=b+a;
		a=b-a;
		b=b-a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20;
    int b=30;
    swapnumber(a, b);
	System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20
	}

}
