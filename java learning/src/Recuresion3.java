class Recuresion3{
	
	public static int Fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		int fact_no = Fact(n-1);
		int fact_n = n* fact_no;
		return fact_n;
		
	}
	
	
	public static void main(String args[])
	{
	int ans = Fact(5);
	System.out.print(ans);
	
	}
}