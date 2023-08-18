package control_condition;

import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eter the value = ");
		int value = sc.nextInt();
		sc.close();
		findDay(value);
	}
	public static void findDay(int value) {
		if(value == 2) {
			System.out.println("Monday");
		}
		else if(value == 3) {
			System.out.println("Tuesday");
		}
		else if(value == 4) {
			System.out.println("Wednesday");
		}
		else if(value == 1) {
			System.out.println("Sunday");
		}
		else if(value == 5) {
			System.out.println("Thursday");
		}
		else if(value == 6) {
			System.out.println("Friday");
		}
		else if(value == 7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid input");
		}
		
	}

}
