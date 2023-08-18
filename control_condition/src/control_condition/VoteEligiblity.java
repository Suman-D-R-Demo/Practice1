package control_condition;

import java.util.Scanner;

public class VoteEligiblity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.print("You are Eligible to vote");
		}
		sc.close();
	}

}
