package TypesOfException;

public class AIOOBEExceptionHandling {

public static void main(String[] args) {
		
	System.out.println("Main method sttareted");
		int arr[] =new int[3];
		arr[0]=12;
		arr[1]=44;
		arr[2]=99;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		System.out.println("main method ended");
	}
}
	

