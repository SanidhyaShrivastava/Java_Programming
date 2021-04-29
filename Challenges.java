/**
 * Class Untitled
 */
public class Challenges {
	public static void main(String[] args) {
		
    byte byte_number=45;
    short short_number=100;
    int int_number=456;
    
    long long_number=50000L + 10L*(byte_number+short_number+int_number);
    
    System.out.println("The answer is: " +long_number);
	}
}