package TryCatch;

public class tryblockriskycode {

public static void main(String[] args) {
		
	    System.out.println("Main method started");
		String s=null;
		try {
			System.out.println("Try block started");
			System.out.println(s.length());
			System.out.println("Try block ended");
		}catch(NullPointerException e) {
			System.out.println("catch block started");
			
			System.out.println("catch block ended");
			
		}
		System.out.println("Main method ended");
	}
}
