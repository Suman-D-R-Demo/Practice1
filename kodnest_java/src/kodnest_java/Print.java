package kodnest_java;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yoyr name");
		String a = sc.nextLine();
		System.out.println("enter the platform name");
		String b = sc.nextLine();
		System.out.println("enter the java version");
		String c = sc.nextLine();
		System.out.println("enter the ram size");
		String d =sc.nextLine();
		System.err.println(a+ " " + b + " " + c +" " +d);

	}

}
