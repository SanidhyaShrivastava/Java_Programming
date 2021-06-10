import java.util.Scanner;

public class SumOfEachRowAndColumn {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows= scanner.nextInt();
		System.out.print("Enter no. of column: ");
		int column=scanner.nextInt();
//		=============Input for Matrix========================
		int[][] matrix= new int[rows][column];
		System.out.println("========Input for Matrix=======");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Enter element at position ["+(i+1)+(j+1)+"]: ");
				matrix[i][j]= scanner.nextInt();
			}
		}
		scanner.close();
//		=================================================

		
		
		
//		=============Printing Matrix============================
		System.out.println("===============Matrix==============");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(matrix[i][j]+"  ");
				
			}
			System.out.println();
		}
		System.out.println("=============================");
//		=================================================
		int sumOfRows=0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				sumOfRows +=matrix[i][j];
			}
			System.out.println("Sum of the "+i+" position row = "+sumOfRows);
		}
		
		System.out.println("===============================");
		for(int j=0; j<column; j++) {
			for(int i=0; i<rows; i++) {
				sumOfRows +=matrix[i][j];
			}
			System.out.println("Sum of the "+j+" position column = "+sumOfRows);
		}

	
	
	
	
	
	
	
	
	
	
	}

}
