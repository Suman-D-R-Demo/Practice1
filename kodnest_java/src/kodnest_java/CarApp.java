package kodnest_java;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Car c1 = getInput("Car 1");
        Car c2 = getInput("Car 2");

        System.out.println("Car 1: manufacturing = " + c1.manufacturing + ", model = " + c1.model + ", price = " + c1.price);
        c1.drive();
        c1.honk();

        System.out.println("Car 2: manufacturing = " + c2.manufacturing + ", model = " + c2.model + ", price = " + c2.price);
        c2.drive();
        c2.honk();

    }
    public static Car getInput(String carNumber) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter car manufacturing for " + carNumber + ":");
        String manufacturing = sc.nextLine();
        System.out.println("Enter car model for " + carNumber + ":");
        String model = sc.nextLine();
        System.out.println("Enter car price for " + carNumber + ":");
        double price = sc.nextDouble();
        sc.nextLine();
        sc.close();
        return new Car(manufacturing, model, price);
    }

}
