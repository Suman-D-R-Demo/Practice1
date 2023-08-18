import java.util.*;

class String1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		StringBuilder name = new StringBuilder("suman");
		System.out.println(name);
		for(int i=0;i<name.length()/2;i++)
		{
			int front = i;
			int back = name.length()-1-i;
			
			char frontc = name.charAt(front);
			char backc = name.charAt(back);
			
			name.setCharAt(front, backc);
			name.setCharAt(back, frontc);
			
			
		}
		System.out.print(name);
	}
}