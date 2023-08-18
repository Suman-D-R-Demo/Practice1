import java.util.*;

class Arrays2{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		int matrix[][] = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int rowstart =0;
		int rowend =n-1;
		int colstart=0;
		int colend=m-1;
		
		System.out.print("matrix is");
		
		while(rowstart<=rowend && colstart<=colend)
		{
			for(int i=rowstart;i<=rowend;i++)
			{
				System.out.print(matrix[i][colstart]+" ");
			}
			colstart++;
			
			for(int i=colstart;i<=colend;i++)
			{
				System.out.print(matrix[rowend][i]+" ");
			}
			rowend--;
			
			for(int i=rowend;i>=rowstart;i--)
			{
				System.out.print(matrix[i][colend]+" ");
			}
			colend--;
			
			for(int i=colend;i>=colstart;i--)
			{
				System.out.print(matrix[rowstart][i]+" ");
			}
			rowstart++;
		}
		
	}
}