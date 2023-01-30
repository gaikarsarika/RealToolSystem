package FinallyBlock;

public class FinallyBlockDemo1 {

public static void main(String[] args) {
		
		System.out.println("Main method started");
		int a=10;
		int b=0;
		try {
			
			int c=a/b;
			System.out.println(c);
			}catch(ArithmeticException e) {
				System.out.println(e);
				
				String s=null;
				System.out.println(s.length());
				
			
		}finally {
			
			System.out.println("finally block");
		}
		
		System.out.println("Main method end");
}

}
