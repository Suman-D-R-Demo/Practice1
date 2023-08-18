import java.util.Scanner;

public class CheckGivenNo {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int a = sc.nextInt();
		sc.close();
		for(int i = 2;i<=a/2;++i) {
			if(a%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("The give number is prime number");
		}
		else {
			System.out.println("The given no is not prime");
		}
	}
}
