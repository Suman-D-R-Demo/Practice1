package kodnest_java;

import java.util.Scanner;

public class PowerOfSquars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int a = sc.nextInt();
		System.out.println("The square of the number = "+squar(a));
	}
	public static double squar(int a) {
		return a*a;
	}
}
