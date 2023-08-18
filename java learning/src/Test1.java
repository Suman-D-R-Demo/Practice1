import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String a = "suman";
		String[] b = a.split("");
		String temp = b[0];
		b[0]=b[b.length-1];
		b[b.length-1]=temp;
		String c = String.join("",b);
		System.out.println(c);
	}
}
