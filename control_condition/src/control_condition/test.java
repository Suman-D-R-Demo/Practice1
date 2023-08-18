package control_condition;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int num1 = sc.nextInt();
		Operation(num1);
		
		
		
	}
	public static void Operation(int num1) {
		
		
		switch(num1) {
		case 0:
			System.out.print(num1);
			//break;
		case 1:
			System.out.print(num1);
		case 2:
			System.out.print(num1);
			//break;
		case 3:
			System.out.println(num1);
			//break;
		case 4:
			System.out.println(num1);
			break;
		default:
			System.out.println("Invalid output");
			
		}
	}

}
