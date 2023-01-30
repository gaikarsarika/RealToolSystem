package TryCatch;

public class RunTimeException {

public static void main(String[] args) {
		
		
		System.out.println("main method started");
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}catch(RuntimeException r){
			
		}
		System.out.println("main method ended");
	}
}
