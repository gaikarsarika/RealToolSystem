package TrowableException;

public class ToStringMethodDemo1 {

public static void main(String[] args) {
		
		
		System.out.println("main method started");
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}catch(Throwable e){
			System.out.println(e);
		}
		System.out.println("main method ended");
	}
}
