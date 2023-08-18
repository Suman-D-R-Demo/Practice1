class pen{
	String color;
	String type;
	
	public void write()
	{
		System.out.print("hello");
	}
}

public class opps{
	
	public static void main(String args[])
	{
		pen pen1 =new pen();
		pen1.color="blue" ;
		pen1.type = "ink";
		
		pen1.write();
		
	}
	
}