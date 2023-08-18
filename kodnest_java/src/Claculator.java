import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the operation to be done");
		System.out.println("enetr \n 1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for devision \n 5 for reminder ");
		int n = sc.nextInt();
		System.out.println("enter the tow number to do operation");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(n==1) {
			sum(a,b);
		}
		else if(n==2) {
			sub(a,b);
		}
		else if(n==3) {
			multi(a,b);
		}
		else if(n==4) {
			dev(a,b);
		}
		else {
			rem(a,b);
		}

	}
	public static void sum(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void sub(int a,int b) {
		int sub = a-b;
		System.out.println(sub);
	}
	public static void multi(int a,int b) {
		int multi = a*b;
		System.out.println(multi);
	}
	public static void dev(int a,int b) {
		int dev = a/b;
		System.out.println(dev);
		
	}
	public static void rem(int a,int b) {
		int rem = a%b;
		System.out.println(rem);
	}
}
