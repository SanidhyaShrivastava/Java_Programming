import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Hollow Rectangle: ");
		int rows= scanner.nextInt();
		System.out.print("Number of column to print Hollow Rectangle: ");
		int column=scanner.nextInt();
		scanner.close();
		
		String star="*";
		
		System.out.println("===========================================");	
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=column; j++){
				if(i==1 || i==rows|| j==1 || j==column) {
					System.out.print(star);
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
