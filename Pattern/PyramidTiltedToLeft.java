import java.util.Scanner;

public class PyramidTiltedToLeft {
	public static void main(String [] args) {
    	Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Pyramid Tilted to left: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		System.out.println("========================================");
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(star + " ");
				
				
			}
			System.out.println();
		}
		

		
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(star+" ");
			}
			System.out.println();
		}
    
    
    
    
    
    
    }

}
