package control_condition;

import java.util.Scanner;

public class ArthameticSwitch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the chooice \n + ==> Addition \n - ==> Substraction \n * ==> Multiplication \n / ==> Division \n % ==> Remainder");
		char a = sc.next().charAt(0);
		Operation(num1,num2,a);
		
		
		
	}
	public static void Operation(int num1,int num2,char a) {
		
		
		switch(a) {
		case '+':
			System.out.print(num1 +num2);
			break;
		case '-':
			System.out.print(num1-num2);
		case '*':
			System.out.print(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("Invalid output");
			
		}
//		if(a == '+') {
//			System.out.print(num1+num2);
//		}
//		else if(a == '-') {
//			System.out.print(num1-num2);
//		}
//		else if(a == '/') {
//			System.out.print(num1/num2);
//		}
//		else if(a == '*') {
//			System.out.println(num1*num2);
//		}
//		else if(a == '%') {
//			System.out.println(num1%num2);
//		}
//		else {
//			System.out.println("Invalid input");
//		}
		
	}

}
