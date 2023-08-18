class Sorting3{
	
	public static void Printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {9,2,6,8,4,3};
		
		for(int i=1;i<arr.length;i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		Printarr(arr);
	}
}