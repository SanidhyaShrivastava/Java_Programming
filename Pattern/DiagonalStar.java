import java.util.Scanner;

public class DiagonalStar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Diagonal Star: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================

		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=rows; j++) {
				if(i==0 || i==rows || j==0 || j==rows || i==j || j==rows-i) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	
	}

}
