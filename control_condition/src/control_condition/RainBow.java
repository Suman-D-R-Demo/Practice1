package control_condition;

import java.util.Scanner;

public class RainBow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eter the alphabet = ");
		char alphabet = sc.next().charAt(0);
		sc.close();
		check(alphabet);
	}
	public static void check(char alphabet) {
		//check the rainbow alphabets 
		if(alphabet == 'V' || alphabet == 'v') {
			System.out.println("Rainbow has ("+alphabet+")voilet colour");
		}
		else if(alphabet == 'I' || alphabet == 'i') {
			System.out.println("Rainbow has ("+alphabet+")indigo colour");
		}
		else if(alphabet == 'G' || alphabet == 'g') {
			System.out.println("Rainbow has ("+alphabet+")green colour");
		}
		else if(alphabet == 'B' || alphabet == 'b') {
			System.out.println("Rainbow has ("+alphabet+")blue colour");
		}
		else if(alphabet == 'Y' || alphabet == 'y') {
			System.out.println("Rainbow has ("+alphabet+")yellow colour");
		}
		else if(alphabet == 'O' || alphabet == 'o') {
			System.out.println("Rainbow has ("+alphabet+")orange colour");
		}
		else if(alphabet == 'R' || alphabet == 'r') {
			System.out.println("Rainbow has ("+alphabet+")red colour");
		}
		// if there is no color form that alphabet if will run else statement
		else {
			System.out.println("Rainbow don,t have from alphabet "+alphabet+" color");
		}
	}

}
