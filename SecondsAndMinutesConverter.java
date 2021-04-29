/**
 * Class Untitled
 */
public class SecondsAndMinutesConverter {
	public static void main(String[] args) {
		getDurationString(121);
		getDurationString(2,1);
	}
	
	public static int getDurationString(int minutes, int seconds){
		
		if((minutes>=0) &&(seconds>=0 && seconds<=59)){
			int hours=minutes/60;
			int remainingMinutes=minutes%60;
			System.out.println(hours + " hours "+remainingMinutes+" minutes "+ seconds+" seconds" );
			return 0;
		}
		else{
			System.out.println("Invalid Value");
			return -1;
		}
	
	}
		public static int getDurationString(int seconds){
			if(seconds>=0){
				int minutes=seconds/60;
				int remainingMinutes=seconds%60;
				System.out.println(minutes+" minutes "+remainingMinutes+" seconds");
				return 0;
			}
			else{
				return -1;
			}
			
		}
}