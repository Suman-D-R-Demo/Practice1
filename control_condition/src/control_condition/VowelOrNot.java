package control_condition;

import java.util.Scanner;

public class VowelOrNot {
	public static void check(char alphabet) {
		if(alphabet == 'a' || alphabet == 'e' || alphabet =='i' ||alphabet=='o' ||alphabet=='u' || alphabet == 'A' || alphabet == 'E' || alphabet =='I' ||alphabet=='O' ||alphabet=='U') {
			System.out.println("The character "+alphabet+" is vowel");
		}
		else {
			System.out.println("The character "+alphabet+" is consonent");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ehter the character ");
		char alphabet = sc.next().charAt(0);
		sc.close();
		check(alphabet);

	}

}
