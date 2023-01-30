package FinallyBlock;

public class FinalBlockException {

public static void main(String[] args) {
		
		System.out.println("Main method started");
		int a=10;
		int b=0;
		try {
			int c=a/b;
			
			System.out.println(c);
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			
			System.out.println("finally block");
		}
		
		System.out.println("Main method end");
}

}
