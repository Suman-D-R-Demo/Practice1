package kodnest_java;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter the 1st String = ");
		String a = sc.nextLine();
		System.out.print("Enter the second String = ");
		String b = sc.nextLine();
		sc.close();
		System.out.println(concat(a,b));
	}
	public static String concat(String a,String b) {
		return a+" "+b;
	}

}
