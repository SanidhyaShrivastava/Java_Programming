import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Hollow Pyramid: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				if(i==rows || k==1 || k==(i*2-1) || i==1) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
