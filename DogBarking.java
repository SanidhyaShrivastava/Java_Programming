/**
 * Class Untitled
 */
public class DogBarking {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true,7));
    
	}
	 
   public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}