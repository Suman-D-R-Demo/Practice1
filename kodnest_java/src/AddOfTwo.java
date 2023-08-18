import java.util.Scanner;

class AddOfTwo{
	public static double sum(double a,double b) {
		double c = a+b;
		return c;
	}
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the 1st vale");
		a = sc.nextDouble();
		System.out.println("Enetr the 2nd vale");
		b = sc.nextDouble();
		sc.close();
		System.out.println("The sum = " +sum(a,b));
	}
}