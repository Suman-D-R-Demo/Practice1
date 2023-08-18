package control_condition;

import java.util.Scanner;

public class VoteEligiblityCheck {
	
	public static void voteCheck(int age) {
		if(age >= 18) {
			System.out.print("You are Eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age = ");
		int age = sc.nextInt();
		sc.close();
		voteCheck(age);
		
	}

}
