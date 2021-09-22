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
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				if(k==1 || k==(i*2-1)|| i==1) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		===================================================
		for(int i=rows; i>=1; i--){
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				if(k==1 || k==(i*2-1)|| i==1) {
					System.out.print(star);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	}

}
