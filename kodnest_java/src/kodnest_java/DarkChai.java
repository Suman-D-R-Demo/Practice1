package kodnest_java;

import java.util.Scanner;

public class DarkChai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flv = sc.nextLine();
		int qty = sc.nextInt();
		chai();
		flavered( flv);
		chaiQuamtity(qty);
		flaveredQuantity(flv,qty);
		
	}

	public static void flaveredQuantity(String flv,int qty) {
		System.out.println("your chai of "+flv+" of quanty "+qty+" cost = "+qty*15);
	}

	public static void chaiQuamtity(int qty) {
		System.out.println("your chai of quantity "+qty+" cost = "+qty*10);
	}

	public static void flavered(String flv) {
		System.out.println("your "+flv+" chai cost 15.0");
		
	}

	public static void chai() {
		System.out.println("your chai cost is 10.0");
	}
	

}
