/**
 * Class Untitled
 */
public class PlayingCat {
	public static void main(String[] args) {
    	boolean catPlaying=isCatPlaying(true,39);
    	System.out.println(catPlaying);
	}
	
	public static boolean isCatPlaying(boolean summer, int nametemperature){
        if((summer) && nametemperature>=25 && nametemperature<=45){
            return true;
        }
        else if((!summer) && nametemperature>=25 && nametemperature<=35){
            return true;
        }
        else{
            return false;
        }
    }
}