package ExceptionPropogation;

public class ExceptionPropogationMethodDemo1 {

public void m1() {
		
		System.out.println("m1 ethod started");
		
		m2();
		
		
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
		try{
			exceptionropogation.m1();
		}catch(ArithmeticException a) {
		System.out.println(a);
		}
		System.out.println("main ethod end");
		
		
	}
}
