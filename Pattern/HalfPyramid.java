import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Half Pyramid triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		System.out.println("========================================");
		
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(star + "  ");
				
				
			}
			System.out.println();
		}
	
	
	
	

	}

}
