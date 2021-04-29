/**
 * Class Untitled
 */
public class LengthConverter {
	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(156);
    	
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		if((feet>=0) && (inches>=0 && inches<=12)){
			double centimeters=feet*30.48;
			centimeters =centimeters+inches*2.54;
			System.out.println(feet + " feet, "+ inches + " inches = "+ centimeters +" cm");
			return 0;
		}
		else{
			System.out.println("Invalid feet or inches parameter");
			return -1;
		}
	}
	
		public static double calcFeetAndInchesToCentimeters(double inches){
			
			if(inches<0){
				System.out.println("Invalid Number");
				return -1;
			}
			double feet=(int) inches/12;
			double remainingInches=(int) inches%12;
			System.out.println(inches +" inches is equalto "+feet+" feet and "+remainingInches +" inches");
			return calcFeetAndInchesToCentimeters(feet,remainingInches);
			
		}
}
