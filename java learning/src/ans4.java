import java.util.*;

class ans4
{
	public static void circumferenceOfCircle(float r)
	{
		double c ;
		c = 2*3.14*r;
		System.out.print(c);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		circumferenceOfCircle(r);
	}
}