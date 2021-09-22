import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print floyd's triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		
		
		System.out.println("========================================");
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i + "  ");
				
				
			}
			System.out.println();
		}
	
	
	
	
	
	}
}
