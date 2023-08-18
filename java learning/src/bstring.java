import java.util.*;


class bstring{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("suman");
		System.out.println(sb);
		
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'm');
		System.out.println(sb);
		sb.insert(0, 'm');
		System.out.println(sb);
	}
}