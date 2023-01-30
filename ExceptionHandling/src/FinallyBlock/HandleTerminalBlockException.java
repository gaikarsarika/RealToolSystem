package FinallyBlock;

public class HandleTerminalBlockException {

public static void main(String[] args) {
		
		System.out.println("Main method started");
		int a=10;
		int b=0;
		try {
			
			int c=a/b;
			System.out.println(c);
			}catch(ArithmeticException e) {
				System.out.println(e);
			
				String s=null;
				try {
				System.out.println(s.length());
				}catch(NullPointerException n) {
					System.out.println(n);
				
				}
		}finally {
			
			System.out.println("finally block start");
			
			String s="123sarika";
			try {
			Integer.parseInt(s);
			}catch(NumberFormatException n){
				System.out.println(n);
			}
			
		}
		
		System.out.println("Main method end");
			
    }
}
