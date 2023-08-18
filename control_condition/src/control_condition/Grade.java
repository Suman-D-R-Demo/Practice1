package control_condition;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks = ");
		int marks = sc.nextInt();
		checkGrade(marks);
	}
	public static void checkGrade(int marks) {
		if(marks>90) {
			System.out.println("A Grade");
		}
		else if(marks>765 && marks<=90) {
			System.out.println("B Grade");
		}
		else if(marks>60 && marks<= 75) {
			System.out.println("C Grade");
		}
		else if(marks>45 && marks<=60) {
			System.out.println("D Grade");
		}
		else if(marks>=35 && marks<=45) {
			System.out.println("F Grade");
		}

		else {
			System.out.println("Fail");
		}

	}

}
