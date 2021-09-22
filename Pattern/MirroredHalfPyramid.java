import java.util.Scanner;

public class MirroredHalfPyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Half Pyramid tilted to Right: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			
			
			for(int k=1; k<=i; k++) {
				System.out.print(star);
				
				
			}
			System.out.println();
		}

	}

}
