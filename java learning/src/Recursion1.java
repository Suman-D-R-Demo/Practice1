class Recursion1{
	
	public static void PrintNo(int n)
	{
		if(n==0){
			return;
		}
		System.out.println(n);
		PrintNo(n-1);
	}
	
	public static void main(String args[]) {
		
		int n =5;
		PrintNo(n);
		
	}
}