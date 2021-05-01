/**
 * Class Untitled
 */
public class Palindrome {
	public static void main(String[] args) {
    	System.out.println(isPalindrome(121));
	}
	public static boolean isPalindrome(int number){
        int startNumber=number;
        int reverseVal=0;
        int lastNumber;
        while(number !=0){
            
            lastNumber=number%10;
            reverseVal *=10;
            reverseVal +=lastNumber;
            number /=10;
        }
        return reverseVal == startNumber;
       
    }
}