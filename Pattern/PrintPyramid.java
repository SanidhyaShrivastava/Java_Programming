import java.util.Scanner;

public class PrintPyramid {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print to triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		int i,j;
		
		System.out.println("========================================");
		
		for (i = 0; i < rows; i++) {
            for (j =0; j<=rows-i ; j++) {
 
                System.out.print(" ");
            }
            
            for(j=0; j<=i; j++) {
				System.out.print(star + " ");
				
			}
			System.out.println();
		}
		
		
		
		
			
		

	
	
	
	}

	}
