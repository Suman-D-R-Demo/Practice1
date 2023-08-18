import java.util.*;

class ans6{
	
	public static void fib(int n) {
		
		int a=0,b=1;
		System.out.println(a);
		int temp =0;
		for(int i=n; i>=1;i--)
		{
			temp =a+b;
			a = b;
			b=temp;
			System.out.println(temp);
			
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		fib(n);
	}
	
			
		
	
}