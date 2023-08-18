package kodnest_java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ether the principal = ");
		double principal = sc.nextDouble();
		System.out.print("Ether the rate = ");
		double rate = sc.nextDouble();
		System.out.print("Ether the time = ");
		double time = sc.nextDouble();
		sc.close();
		FinanceCalculator c = new FinanceCalculator();
		System.out.print("The intreat is ="+c.calculateSimpleInterest(principal,rate,time));
	}

}
