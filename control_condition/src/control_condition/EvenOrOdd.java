package control_condition;

import java.util.Scanner;

public class EvenOrOdd {
	public static void check(int number) {
		if(number%2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is not even");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int number = sc.nextInt();
		sc.close();
		check(number);

	}

}
