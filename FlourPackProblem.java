
public class FlourPackProblem {

	public static void main(String[] args) {
		System.out.println(canPack(0, 1, 5));
	}
	 public static boolean canPack(int bigCount,int smallCount,int goal){
	        int kilo=1;
	        bigCount *=5*kilo;
	        smallCount *=kilo;
	        int leftOver=goal%5;
	        
	        if(bigCount<0 || smallCount<0 || goal<0){
	            return false;
	        }
	        
	        if((bigCount+smallCount)<goal){
	            return false;
	        }
	        return smallCount>=leftOver;
	    }
}
