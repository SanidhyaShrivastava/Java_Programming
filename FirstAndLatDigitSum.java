/**
 * Class Untitled
 */
public class FirstAndLatDigitSum {
	public static void main(String[] args) {
    	int n=SumFirstAndLastDigit(234);
    	System.out.println(n);
	}
	public static int SumFirstAndLastDigit(int number){
		 int firstDigit = 0;
        int lastDigit;
        int reverseNum = 0;
        int lastVal;
        
        if(number<0){
        	return -1;
        }
        	lastDigit=number%10;
        while(number>0){
        	lastVal=number%10;
        	number /=10;
        	reverseNum *=10;
        	reverseNum+=lastVal;
        	firstDigit=reverseNum%10;
        
        	
        }
        return lastDigit+firstDigit;

	}
}