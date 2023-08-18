import java.util.Scanner;

public class EvenAndMultipleOfEight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the number = ");
		int a = sc.nextInt();
		sc.close();
		check(a);
	}
	public static void check(int a) {
		if(a%2 == 0 && a%8 == 0 && a > 0) {
			System.out.print("The given number is positive ,even and multiple of 8");
		}
		else {
			System.out.println("The givem number is not positive ,even and multiple of 8");
		}
	}

}
