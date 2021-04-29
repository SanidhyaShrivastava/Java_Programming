/**
 * Class Untitled
 */
public class Challenges2 {
	public static void main(String[] args) {
    	
    	
    	double double1=20.00d;
    	double double2=80.00d;
    	
    	double answer=(double1+double2)*100d;
    	System.out.println("Answer is: "+answer);
    	double remainder=answer%40.00d;
    	
    	boolean check=(remainder==0) ? true : false;
    	System.out.println("Check= "+check);
    	
    	if(!check)
    	{
    		System.out.println("Got Some Remainder");
    	}
    	
	}
}