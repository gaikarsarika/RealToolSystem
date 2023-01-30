package TrowableException;

public class ThrowableExceptionDemo1 {

public static void main(String[] args) {
		
		
		System.out.println("main method started");
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}
}
