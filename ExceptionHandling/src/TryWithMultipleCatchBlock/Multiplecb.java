package TryWithMultipleCatchBlock;

public class Multiplecb {

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
		System.out.println(parseInt);
		}catch(Exception e) {
			System.out.println(e);
			
			
		}catch(NullPointerException n) {
			System.out.println(n);
			
		}catch(NumberFormatException n1) {
			System.out.println(n1);
		
	
		System.out.println("main method end");
	}
}
}
