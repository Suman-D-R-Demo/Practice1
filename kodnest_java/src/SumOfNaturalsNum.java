import java.util.Scanner;

class SumOfNaturalsNum{
	
	public static void sum(int n) {
		int sum=0;
		for(int i=n;i>=0;i--) {
			if(n%2 != 0) {
				sum += n;
			}
		}
		System.out.println(sum);
	}
	public static void mian(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum(n);
	}
}