package kodnest_java;

import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius = ");
		double r = sc.nextDouble();
		sc.close();
		PlanetExplorer r1 = new PlanetExplorer();
		System.out.println("The surface are is = " + r1.calculateSurfaceArea(r));

	}
}

class PlanetExplorer {
	public double calculateSurfaceArea(double radius) {
		return radius * radius * 3.14;
	}
}
