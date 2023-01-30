package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	
public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
		FileReader fr=new FileReader("demo.txt");
		}catch(FileNotFoundException e)	{	
		
			e.printStackTrace();
		System.out.println("main method ended");
	}
}
}