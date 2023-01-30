package TryWithMultipleCatchBlock;

public class TrywithmultipleexceptionHandling {

public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		String s="null";
		System.out.println(s.length());
		
		String s1="sarika";
		int parseInt=Integer.parseInt(s1);
		System.out.println(s1);
		}catch(Exception e) {
		
		System.out.println("main method end");
	}
}
}