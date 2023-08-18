package kodnest_java;

import java.util.Scanner;

public class ChaiWalla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the quantity of chai = ");
		int qty = sc.nextInt();
		chai(qty);
	}

	public static void chai(int qty) {
		System.out.println("the chai of quantity "+qty+" cost of = "+10*qty);
	}

}
