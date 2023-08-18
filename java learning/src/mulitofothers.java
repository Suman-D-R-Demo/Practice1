import java.util.Scanner;

class mulitofothers
{
	public static void main(String args[])
	{
		int a,i=1;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		while(i<10) {
			if(a%i==0)
			{
			System.out.println("a is multi of " + i);
		}
			i++;
	}
}
}