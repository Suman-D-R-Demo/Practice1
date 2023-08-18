import java.util.Scanner;

class ans2{
	public static int oddSum(int n)
	{
		int sum=0;
		for(int i=n;i<=n;i--)
		{
			
			if(i%2!=0)
			{
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		
		System.out.print("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		System.out.println("the sum"+ oddSum(n));
	}
}