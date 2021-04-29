/**
 * Class Untitled
 */
public class MinutesToYearAndDaysCalculator {
	public static void main(String[] args) {
    	printYearsAndDays(120000);
	}
	
	 public static void printYearsAndDays(long minutes){
        if(minutes>=0){
            long hours = (int) minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long leftOverDays = days % 365;
        

            System.out.println(minutes+ " min = "+years+" y and "+leftOverDays+" d");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}