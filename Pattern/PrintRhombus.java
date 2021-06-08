import java.util.Scanner;

public class PrintRhombus {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print reverse Pyramid: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		
		String star="*";
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<rows; k++) {
				System.out.print(star+ " ");
			}
			System.out.println();
		}

	}

}
