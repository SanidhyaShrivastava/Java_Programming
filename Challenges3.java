/**
 * Class Untitled
 */
public class Challenges3 {
	public static void main(String[] args) {
    	
    	int positionInHighScoreTable=calculateHighScorePosition(1500);
    	displayHighScorePosition("Sanidhya",positionInHighScoreTable);
    	
    	positionInHighScoreTable=calculateHighScorePosition(900);
    	displayHighScorePosition("Jiya",positionInHighScoreTable);
    	
    	positionInHighScoreTable=calculateHighScorePosition(400);
    	displayHighScorePosition("Pranshu",positionInHighScoreTable);
    	
    	positionInHighScoreTable=calculateHighScorePosition(50);
    	displayHighScorePosition("Bob",positionInHighScoreTable);
    	
	}
	
	public static void displayHighScorePosition(String playerName , int positionInHighScoreTable){
		System.out.println("Player name is " + playerName +" and managed to get in position " + positionInHighScoreTable);
	}
	
	public static int calculateHighScorePosition(int playerScore){
		if(playerScore>=1000){
			return 1;
		}
		else if(playerScore>=500 && playerScore<1000){
			return 2;
		}
		else if(playerScore>=100 && playerScore<500){
			return 3;
		}
		else{
			return 4;
		}
	}
}