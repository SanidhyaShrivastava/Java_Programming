import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print to floyd's triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		int number=1;
		
		System.out.println("========================================");
		
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(number + "  ");
				++number;
				
			}
			System.out.println();
		}
	
	
	
	
	
	}
}
