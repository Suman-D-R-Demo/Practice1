package control_condition;

import java.util.Scanner;

public class CalculateByChoose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number = ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2st number = ");
		int num2 = sc.nextInt();
		System.out.println("Enter your chooice \n Addition ==> 1 \n Substraction ==>2 \n multiplaction ==> 3 \n division=> 4 \n reminder ==> 5");
		int choose = sc.nextInt();
		if (choose == 1) {
			addtionNumbers(num1, num2);
		} else if (choose == 2) {
			subtractNumbers( num1, num2);

		} else if (choose == 3) {
			multiplyNumbers( num1, num2);
		} else if (choose == 4) {
			divideNumbers( num1,  num2);
		} else if (choose == 5) {
			findRemainder( num1,  num2);
		}
		else {
			System.out.println("Invalit chooise");
		}
		sc.close();
	}

	public static void addtionNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void subtractNumbers(int num1, int num2) {
		System.out.println(num1 - num2);	}

	public static void multiplyNumbers(int num1, int num2) {
		System.out.println(num1 * num2);	}

	public static void divideNumbers(int num1, int num2) {
		System.out.println(num1 / num2);	}

	public static void findRemainder(int num1, int num2) {
		System.out.println(num1 % num2);	}

}
