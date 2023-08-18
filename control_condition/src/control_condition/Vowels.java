package control_condition;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ehter the character");
		char alphabet = sc.next().charAt(0);
		if(alphabet == 'a' || alphabet == 'e' || alphabet =='i' ||alphabet=='o' ||alphabet=='u') {
			System.out.println("The character is vowel");
		}
		sc.close();
	}

}
