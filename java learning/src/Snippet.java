

public class Snippet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(j<=i)
				{
					if(count>=10)
					{
						System.out.print(" "+0);
					}
					else {
						System.out.print(" "+count);
						count++;
					}
					
				}

				else 
				{
					System.out.print(" "+0);
				}
			}
			System.out.println();

		}

	}
}