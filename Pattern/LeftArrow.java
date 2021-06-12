import java.util.Scanner;

public class LeftArrow {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Left Arrow: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=rows-i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
//		========================================================
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
	
	
	
	}

}
