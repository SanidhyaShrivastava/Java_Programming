import java.util.Scanner;

public class PrintReversePyramid {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print reverse Pyramid: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		
		System.out.println("========================================");
		
		for (int i =rows; i>=1; i--) {
            for (int j =1; j<=rows-i ; j++) {
 
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++) {
				System.out.print(star + " ");
				
			}
			System.out.println();
		}
	
	
	}

}
