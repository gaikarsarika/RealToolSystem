package ExceptionPropogation;

public class TerminalExceptionHandling {


	public void m1() {
		
		System.out.println("m1 ethod started");
		m2();
		System.out.println("m1 ethod ended");
		}
	
    public void m2() {
		
		System.out.println("m2 ethod started");
		try {
		int a=18/0;
		}catch(ArithmeticException e) {
			
		}
		System.out.println("m2 ethod ended");
		
		}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		NonTerminalExceptionHandling exceptionropogation=new NonTerminalExceptionHandling();
		exceptionropogation.m1();
		System.out.println("main ethod end");
		
		
	}
}
