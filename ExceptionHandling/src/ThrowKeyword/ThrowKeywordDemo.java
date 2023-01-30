package ThrowKeyword;

import java.util.Scanner;

public class ThrowKeywordDemo {
 
	public void votingEligibleOrNot(int age) {
		if(age>=18) {
			
			System.out.println("Your are eligible for voting");
			
		}else {
			throw new VotingNotEligibleException("You ae not eligible for voting your age is less than 18");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("enter your age");
		
		Scanner sc=new Scanner(System.in);
		int age = sc.nextInt();
		ThrowKeywordDemo throwdemo=new ThrowKeywordDemo();
		throwdemo.votingEligibleOrNot(age);
	}
	
}
