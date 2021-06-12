import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Hollow Diamond: ");
		int rows= scanner.nextInt();
		scanner.close();
		
		String star="*";
		System.out.println("=======================================");
//		=====================================================
		for(int i=0; i<=rows; i++){
			for(int j=0; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2; k++) {
				if(k==0 || k==i*2|| i==0) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		===================================================
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=(rows-i)*2; k++) {
				if(i==rows || k==0 || k==(rows-i)*2) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	}

}
