
public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(10);

	}
	public static void numberToWords(int number){
	       if(number<0){
	           System.out.println("Invalid Value");
	       }
	       int newNumber=reverse(number);
	       int digitCountOriginal = getDigitCount(number);
           int digitCountNew = getDigitCount(newNumber);
           int digitDiff;
	       
	       if(newNumber==0){
	           System.out.println("Zero");
	       }
	       int lastDigit;
	       
	       while(newNumber!=0){
	           lastDigit=newNumber%10;
	           switch (lastDigit) {
	                case 0:
	                    System.out.println("Zero");
	                    break;
	                case 1:
	                    System.out.println("One");
	                    break;
	                case 2:
	                    System.out.println("Two");
	                    break;
	                case 3:
	                    System.out.println("Three");
	                    break;
	                case 4:
	                    System.out.println("Four");
	                    break;
	                case 5:
	                    System.out.println("Five");
	                    break;
	                case 6:
	                    System.out.println("Six");
	                    break;
	                case 7:
	                    System.out.println("Seven");
	                    break;
	                case 8:
	                    System.out.println("Eight");
	                    break;
	                case 9:
	                    System.out.println("Nine");
	                    break;
	                default:
	                    break;
	            }
	            newNumber /=10;
	       }
	       if(digitCountOriginal != digitCountNew) {
	            digitDiff = digitCountOriginal - digitCountNew;
	            for(int i = 0; i < digitDiff; i++) {
	                System.out.println("Zero");
	            }
	        }
	       
	   }
	   public static int reverse(int number){
	       int lastDigit;
	       int reverseNum=0;
	       while(number!=0){
	           lastDigit=number%10;
	           reverseNum *=10;
	           reverseNum +=lastDigit;
	           number /=10;
	           
	       }
	       return reverseNum;
	   }
	   public static int getDigitCount(int number){
	       if(number<0){
	           return -1;
	       }
	       int count=0;
	       
	       if(number==0){
	           count++;
	       }
	       while(number!=0){
	           number /=10;
	           count++;
	       }
	       return count;
	   }

}
