package ExceptionPropogation;

public class NonTerminalExceptionHandling {

	

		
		public void m1() {
			
			System.out.println("m1 ethod started");
			m2();
			System.out.println("m1 ethod ended");
			}
		
        public void m2() {
			
			System.out.println("m2 ethod started");
			
			int a=18/0;
			System.out.println("m2 ethod ended");
			}
		
		public static void main(String[] args) {
			System.out.println("main method started");
			NonTerminalExceptionHandling exceptionropogation=new NonTerminalExceptionHandling();
			exceptionropogation.m1();
			System.out.println("main ethod end");
			
			
		}
	
}
	

