class FloydsTriangle
{
	public static void main(String args[])
	{
		int n=10;
		int m=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				m +=1;
				System.out.print(m+" ");
			}
			System.out.println("");
		}
	}
}