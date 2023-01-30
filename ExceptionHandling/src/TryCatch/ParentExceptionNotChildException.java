package TryCatch;

public class ParentExceptionNotChildException {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
		}catch(ArithmeticException e) {
		}
		
		System.out.println("Main method end");
	}
}
