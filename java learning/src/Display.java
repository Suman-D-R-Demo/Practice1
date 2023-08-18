import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks = ");
		int marks = sc.nextInt();
		sc.close();
		grade(marks);
	}
	public static void grade(int a) {
		if(a<35) {
			System.out.println("The garde is F");
		}
		else if(a>35 && a<=60) {
			System.out.println("The grade is C");
		}
		else if(a>60 && a<=75) {
			System.out.println("The grade is B");
		}
		else{
			System.out.println("The grade is A");
		}
	}

}
