import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Number of rows to print Pascal triangle: ");
		int rows= scanner.nextInt();
		scanner.close();
//		================================== Formula used in Pascal triangle is combination formula i.e. nCr  ============================
		
		System.out.println("========================================");
		
		for(int i=0; i<rows; i++){
			
			for(int k=0; k<=rows-i;k++) {
				System.out.print(" ");
			}
			
	        for(int j=0; j<=i; j++){
	            System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
	        }
	        System.out.println();
	    }
	
	
	
	}
	
	public static int factorial(int num) {
		
		    int fact=1;

		    for(int i=1; i<=num; i++){
		        fact*=i;
		    }
		    return fact;
		
	}

}
