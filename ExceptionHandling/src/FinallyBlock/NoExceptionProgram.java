package FinallyBlock;

public class NoExceptionProgram {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		int a=10;
		int b=0;
		try {
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			
			System.out.println("finally block");
		}
		int c=a/b;
		
		System.out.println(c);
		
		System.out.println("Main method end");
}
}
