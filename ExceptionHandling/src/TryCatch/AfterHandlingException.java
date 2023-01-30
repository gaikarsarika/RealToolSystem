package TryCatch;

public class AfterHandlingException {

public static void main(String[] args) {
		
	    System.out.println("Main method started");
		String s=null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			
		}
		System.out.println("Main method ended");
	}
}
