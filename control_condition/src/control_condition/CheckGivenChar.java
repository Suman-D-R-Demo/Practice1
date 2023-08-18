package control_condition;

import java.util.Scanner;

public class CheckGivenChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ehter the character = ");
		char alphabet = sc.next().charAt(0);
		sc.close();
		if(alphabet >= 65 && alphabet <=90) {
			System.out.println("The character is uppercase alphabet");
		}
		else if(alphabet >= 97 && alphabet <=122) {
			System.out.println("The character is lowercase alphabet");
		}
		else {
			System.out.println("The give a numberic value");
		}
		
	}

}
