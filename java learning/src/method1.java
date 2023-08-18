import java.util.*;

class method1{
	
	public static void nameOfPerson(String name)
	{
		System.out.print(name);
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		String name =sc.nextLine();
		nameOfPerson(name);
		
		
	}
}