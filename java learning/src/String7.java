import java.util.*;

class String7{

		   public static void main(String args[]) {
		     Scanner sc = new Scanner (System.in);
		     String size = sc.next();
		     String result = "";
		   


		     for(int i=0; i<size.length(); i++) {
		      
		    	 if(size.charAt(i)== 'e')
		    	 {
		    		 result += 'i';
		    	 }
		    	 else
		    	 {
		    		 result += size.charAt(i);
		    	 }
		     }
		     System.out.print(result);
		     
		   }
		}
