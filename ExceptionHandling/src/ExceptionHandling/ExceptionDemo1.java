package ExceptionHandling;

public class ExceptionDemo1 {

public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		int a=10;
		int b=0;
		try {
			int c=a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			
		}
		System.out.println("main method ended");
	}
}
