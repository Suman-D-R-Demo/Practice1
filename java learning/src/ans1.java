import java.util.*;

class ans1{
	
	public static int avg(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		System.out.print("the avg of 3 number is "+ avg(a,b,c));
		
		
	}
}