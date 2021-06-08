import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print to Pascal triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
//		================================== Formula used in Pascal triangle is combination formula i.e. nCr  ============================
		int number=1;
		System.out.println("========================================");
		
		for (int i = 0; i < rows; i++) {
            for (int space =0; space<=rows-i; space++) {
 
                System.out.print(" ");
            }
            
            for(int k=0; k<=i; k++) {
            	
            	if (k==0||i==0)
                    number=1;
                else
                	 number= number*(i-k+1)/k;
            	 System.out.print(number+" ");
				
				
			}
			System.out.println();
		}
	
	
	
	}

}
