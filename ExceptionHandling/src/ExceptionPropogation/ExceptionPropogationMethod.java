package ExceptionPropogation;

public class ExceptionPropogationMethod {

public void m1() {
		
		System.out.println("m1 ethod started");
		try {
		m2();
		}catch(ArithmeticException e) {
		
		}
		System.out.println("m1 method ended");
}
	
    public void m2() {
		
		System.out.println("m2 method started");
		
		int a=18/0;
		
		
		System.out.println("m2 method ended");
		
		}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		NonTerminalExceptionHandling exceptionropogation=new NonTerminalExceptionHandling();
		exceptionropogation.m1();
		System.out.println("main ethod end");
		
		
	}
}
