import java.util.Scanner;

public class HollowHalfPyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Hollow Half Pyramid: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================
		for(int i=0; i<=rows; i++){
			for(int j=0; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				if(i==0 || i==rows || k==0 || k==i) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
	
	
	}

}
