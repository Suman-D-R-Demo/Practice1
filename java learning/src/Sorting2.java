class Sorting2{
	
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
		
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		
		Printarr(arr);
	}
}