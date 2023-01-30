package NestedTryBlock;

import TryCatch.AirtmaticOperation;

public class NestedTryBlockDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		int a=10;
		int b=2;
		
		try {
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
			String s=null;
			try {
				System.out.println(s.length());
			}catch(NullPointerException n) {
				System.out.println(n);
			}
		}
		System.out.println("Main method ended");
	
}
}