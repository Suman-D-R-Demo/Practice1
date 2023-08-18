package kodnest_java;

public class Car {
	
	String manufacturing;
	String model;
	double price;
	
	void drive() {
		System.out.println("buszz buszzz "+manufacturing);
	}
	void honk() {
		System.out.println("poomm poomm");
	}
	Car(String manufacturing,String model, double price){
		this.manufacturing = manufacturing;
		this.model = model;
		this.price = price;
	}
}
