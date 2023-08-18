package kodnest_java;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fahrenheit = ");
		double fahrenheit = sc.nextDouble();
		sc.close();
		TemperatureConverter T = new TemperatureConverter();
		System.out.println("The temperaturen celsius is = "+T.convertFahrenheitToCelsius(fahrenheit));
	}

}
