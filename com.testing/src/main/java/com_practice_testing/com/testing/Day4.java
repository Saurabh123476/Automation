
package com_practice_testing.com.testing;

public class Day4 {

	public static void main(String[] args) {
		
		//passing argument to method

		mymethod(54);
		
		
	}
	
	public static  void mymethod(int age) {
		if(age>18) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	
}
