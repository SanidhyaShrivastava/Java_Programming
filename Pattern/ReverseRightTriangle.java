import java.util.Scanner;

public class ReverseRightTriangle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print to reverse right triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		System.out.println("========================================");
		
		for(int i=rows; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print(star+" ");
			}
			System.out.println();
		}
		
	
	
	
	
	}

}
