package forLoop;

import java.util.Scanner;

public class SumOFNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numebrs = ");
		int num = sc.nextInt();
		int sum = 0 ;
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		System.out.println("the sum is = "+sum);
		sc.close();
		}

}
