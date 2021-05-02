/**
 * Class Untitled
 */
public class EvenDigitSum {
	public static void main(String[] args) {
    	int evenNum=getEvenDigitSum(556);
    	System.out.println(evenNum);
	}
	public static int getEvenDigitSum(int number){
		int lastDigit;
		int evenSum=0;
		
		if(number<0){
			return -1;
		}
		
		while(number>0){
			lastDigit=number%10;
			if(lastDigit%2==0){
				evenSum +=lastDigit;
			}
			number/=10;
		}
		return evenSum;
	}
}