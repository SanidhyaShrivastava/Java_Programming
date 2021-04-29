/**
 * Class Untitled
 */
public class DecimalComparator {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(12.456,12.4567));
    
	}
	
	 public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double result1=num1*1000;
        double result2=num2*1000;
        
        if((int)result1==(int)result2 ){
            return true;
        }
        else{
            return false;
        }
    }
}