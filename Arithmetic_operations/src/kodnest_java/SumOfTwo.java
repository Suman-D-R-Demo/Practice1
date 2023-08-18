package kodnest_java;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number = ");
		int num1 = sc.nextInt(); // taking input from user for num1
		System.out.print("Enter the 2nd number = ");
		long num2 = sc.nextLong();// taking input from user for num2
		sc.close();
		System.out.println("The total sum = "+galacticAddition(num1,num2)+"L");// calling galacticAddition function and printing

	}
	public static long galacticAddition(int num1,long num2) {
		long n = num1+num2; // adding the to numbers 
		return n; //returning the total sum
	}

}
