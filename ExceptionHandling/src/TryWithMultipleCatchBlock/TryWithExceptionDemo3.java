package TryWithMultipleCatchBlock;

public class TryWithExceptionDemo3 {

public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
		String s="null";
		System.out.println(s.length());
		
		String s1="sarika";
		int parseInt=Integer.parseInt(s1);
		System.out.println(s1);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("main method end");
	}
}
