package ExceptionPropogation;

public class ExceptionPropogationDemo {

	
		public void m1() {
			
			System.out.println("m1 ethod started");
			m2();
			System.out.println("m1 ethod ended");
			}
		
public void m2() {
			
			System.out.println("m2 ethod started");
			
			System.out.println("m2 ethod ended");
			}
		
		public static void main(String[] args) {
			
			ExceptionPropogationDemo exceptionropogation=new ExceptionPropogationDemo();
			exceptionropogation.m1();
			
			
	}
}
