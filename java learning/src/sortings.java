import java.util.*;

class sortings{
	
	public static void main(String args[])
	{
		int arr[] = {1,7,3,4,5};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j =0 ;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printarray(arr);
		
	}
	
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
		
	
}