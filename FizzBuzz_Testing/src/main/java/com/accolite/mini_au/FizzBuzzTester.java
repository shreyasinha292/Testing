package com.accolite.mini_au;

public class FizzBuzzTester {

	public FizzBuzzTester() {
		// TODO Auto-generated constructor stub
	}
	
	public String getResult(int n) {
		
		if((n % 3 == 0) && (n % 5 == 0)) {
			System.out.println("num = "+ n +":FizzBuzz");
			return "FizzBuzz";
		}
		
		else if(n % 3 == 0) {
			System.out.println("num = "+ n +":Fizz");
			return "Fizz";
		}
		
		else if(n % 5 == 0) {
			System.out.println("num = "+ n +":Buzz");
			return "Buzz";
		}
		System.out.println("num = "+ n);
		return "none";
		
	}

}
