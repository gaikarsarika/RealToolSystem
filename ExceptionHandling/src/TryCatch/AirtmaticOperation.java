package TryCatch;

public class AirtmaticOperation {

	public static void main(String[] args) {
		
		
		System.out.println("main method started");
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}catch(ArithmeticException e){
			
		}
		System.out.println("main method ended");
	}
}
