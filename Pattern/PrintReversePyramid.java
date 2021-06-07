import java.util.Scanner;

public class PrintReversePyramid {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print to reverse triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		
		System.out.println("========================================");
		
		for (int i = 0; i < rows; i++) {
            for (int j =0; j<=i; j++) {
 
                System.out.print(" ");
            }
            
            for(int k=0; k<=rows-i-1; k++) {
				System.out.print(star + " ");
				
			}
			System.out.println();
		}
	
	
	
	}

}
