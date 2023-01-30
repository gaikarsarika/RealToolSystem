package PropogaseException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

	public void m2() {
		System.out.println("m2 method start");
		m1();
		System.out.println("m2 method end");
		
		
	}
	public void m1() {
		
		System.out.println("m2 method started");
		try {
			FileReader fr=new FileReader("demo.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("m1 method end");
	}
	public static void main(String[] args) {
		
		System.out.println("main method start");
		ThrowsDemo td= new ThrowsDemo();
		td.m2();
		System.out.println("main method end");
		
	}
}
