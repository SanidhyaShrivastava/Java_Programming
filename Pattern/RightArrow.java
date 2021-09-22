import java.util.Scanner;

public class RightArrow {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Right Arrow: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=rows-i+1; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
//		======================================================
	
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=rows-i+1; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	}

}
