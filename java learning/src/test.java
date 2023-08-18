import java.util.*;

class test
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int counta=0,countb=0;
		for(int i=0;i<word.length();i++)
			
		{
			if(word.charAt(i)== 'a')
			{
				counta++;
			}
			else if(word.charAt(i)== 'b')
			{
				countb++;
			}
		}
		if(counta == word.length()|| countb == word.length())
		{
			System.out.print("true");
		}
		else if(word.charAt(0)=='a' && word.charAt(word.length()-1)=='a' || word.charAt(0)!='b' || word.charAt(word.length()-1)!='a')
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
			
	}
    
		
}