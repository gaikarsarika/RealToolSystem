package TypesOfException;

public class NoOfException {

public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		String s="123Santosh";
		System.out.println(s);
		
		try {
		Integer parseInt=Integer.parseInt(s);
		} catch(NumberFormatException n) {
			
		
		System.out.println("n.getMessage");
	}
}
}