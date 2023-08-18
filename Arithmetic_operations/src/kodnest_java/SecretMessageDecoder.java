package kodnest_java;

import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();
		MessageDecoder a1 = new MessageDecoder();
		System.out.println("The decoded value is = " + a1.decodeCharacter(a));
	}

	public double calculateSurfaceArea(double radius) {
		return radius * radius * 3.14;
	}

}
