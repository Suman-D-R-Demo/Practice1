package kodnest_java;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int a = sc.nextInt();
		sc.close();
		System.out.println("The cube of the number = "+squar(a));
	}
	public static double squar(int a) {
		return a*a*a;
	}

}
