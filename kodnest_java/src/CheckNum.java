import java.util.Scanner;

class CheckNum{
	public static void check(int n) {
		if(n == 0) {
			System.out.println("The number is zero");
		}
		else if(n > 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		check(n);
	}
}