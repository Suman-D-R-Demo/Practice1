package kodnest_java;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		sc.close();
		JourneyCalculato journeyCalculato = new  JourneyCalculato();
		double distance = journeyCalculato.calculateDistance(speed,time);
		System.out.println("the distance traveled is "+distance+"k/h");
	}

}
