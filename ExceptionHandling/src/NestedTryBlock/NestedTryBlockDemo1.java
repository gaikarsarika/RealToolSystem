package NestedTryBlock;

public class NestedTryBlockDemo1 {
 
	public static void main(String[] args) {
		
	
	System.out.println("Main method started");
	int a=10;
	int b=0;
	
	try {
	int c=a/b;
	
	String s=null;
	try {
	System.out.println(s.length());
	}catch(NullPointerException n) {
		System.out.println(n);
	
	}
	
	}catch(ArithmeticException e) {
	System.out.println(e);
	}
	
	
	
	System.out.println("Main method end");
}
}
