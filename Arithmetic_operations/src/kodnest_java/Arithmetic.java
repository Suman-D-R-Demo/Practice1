package kodnest_java;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number = ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2st number = ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("The subtract of two number = "+subtractNumbers(num1,num2)); 
		System.out.println("The multiple of two number = "+multiplyNumbers(num1,num2)); 
		System.out.println("The divident of two number = "+divideNumbers(num1,num2)); 
		System.out.println("The reminder of two number = "+findRemainder(num1,num2));
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}
