package TypesOfException;

public class SIOOExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		String s="Sariks";
		try {
		System.out.println(s.charAt(9));
		}catch(StringIndexOutOfBoundsException s1) {
		}
		System.out.println("main method ended");
	}
	

}