class Recursion2{
	
	public static void PrintSum(int i,int n,int sum)
	{
		if(i == n)
		{
			sum +=i;
			System.out.print(sum);
			return;
		}
		sum +=i;
		PrintSum(i+1,n,sum);
	}
	
	public static void main(String args[]) {
		
		PrintSum(1,5,0);
		
		
	}
}