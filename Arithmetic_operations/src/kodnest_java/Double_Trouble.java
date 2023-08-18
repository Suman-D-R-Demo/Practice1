package kodnest_java;

import java.util.Scanner;

public class Double_Trouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("The doubled number is = "+doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}
