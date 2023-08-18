package kodnest_java;

import java.util.Scanner;

public class HeightConverte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the inches = ");
		double a = sc.nextDouble();
		sc.close();
		HeightConverter converter = new HeightConverter(); 
		System.out.println("the foot is = "+converter.convertInchesToFeet(a));
	}
}

class HeightConverter{
	public double convertInchesToFeet(double a) {
		return a/12;
	}
}
