package TryWithMultipleCatchBlock;

public class multiplecatchblockDemo3 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
		String s="bendre";
		System.out.println(s.length());
		
		String s1="sarika";
		int parseInt=Integer.parseInt(s1);
		System.out.println(parseInt);
		}catch(ArithmeticException a) {
			System.out.println(a);
			
		}catch(NullPointerException n) {
			System.out.println(n);
			
		}catch(NumberFormatException n1) {
			System.out.println(n1);
		}
		
		System.out.println("main method end");
	}
}
