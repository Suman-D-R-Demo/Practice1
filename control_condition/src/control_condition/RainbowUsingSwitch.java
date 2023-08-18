package control_condition;

import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eter the alphabet = ");
		char alphabet = sc.next().charAt(0);
		sc.close();
		check(alphabet);
	}
	public static void check(char alphabet) {
		//check the rainbow alphabets 
		switch(alphabet) {
		case 'V':
		case 'v': {
			System.out.println("Rainbow has ("+alphabet+")voilet colour");
			break;
		}
		case 'I':
		case 'i': {
			System.out.println("Rainbow has ("+alphabet+")indigo colour");
			break;
		}
		case 'G':
		case 'g':{
			System.out.println("Rainbow has ("+alphabet+")green colour");
			break;
		}
		case 'B':
		case 'b':{
			System.out.println("Rainbow has ("+alphabet+")blue colour");
			break;
		}
		case 'Y':
		case 'y':{
			System.out.println("Rainbow has ("+alphabet+")yellow colour");
			break;
		}
		case 'O':
		case 'o':{
			System.out.println("Rainbow has ("+alphabet+")orange colour");
			break;
		}
		case 'R':
		case 'r':{
			System.out.println("Rainbow has ("+alphabet+")red colour");
			break;
		}
		// if there is no color form that alphabet if will run else statement
		default: {
			System.out.println("Rainbow don,t have from alphabet "+alphabet+" color");
			break;
		}
	}
	}
}
