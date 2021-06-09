
import java.util.Scanner;



public class ButterflyProgram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Butterfly: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		
		
		System.out.println("=====================================================");
//		============================= For Upper Half======================================		
		for(int i=0; i<=rows-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(star);
			}
			
			for(int k=0; k<=(rows-i)*2; k++) {
				System.out.print(" ");
			}
			for(int l=0; l<=i; l++) {
				System.out.print(star);
			}System.out.println();
		}
//		==================================================================================
	
//		============================== For Lower Half=====================================
		
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=rows-i; j++) {
				System.out.print(star);
			}
			for(int k=0; k<=i*2; k++) {
				System.out.print(" ");
			}
			for(int l=0; l<=rows-i; l++) {
				System.out.print(star);
			}
			System.out.println();
		}
//		==================================================================================
	
	
	
	
	}

}
