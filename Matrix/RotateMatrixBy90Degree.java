import java.util.Scanner;

public class RotateMatrixBy90Degree {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter no. of rows or column: ");
		int rowsOrColumn= scanner.nextInt();
		
//		=============Input for Matrix========================
		int[][] matrix= new int[rowsOrColumn][rowsOrColumn];
		System.out.println("========Input for Matrix=======");
		for(int i=0; i<rowsOrColumn; i++) {
			for(int j=0; j<rowsOrColumn; j++) {
				System.out.print("Enter element at position ["+(i+1)+(j+1)+"]: ");
				matrix[i][j]= scanner.nextInt();
			}
		}
		scanner.close();
//		=================================================
//		=============Printing Matrix============================
		System.out.println("===============Matrix Before Rotation==============");
		for(int i=0; i<rowsOrColumn; i++) {
			for(int j=0; j<rowsOrColumn; j++) {
				System.out.print(matrix[i][j]+"  ");
				
			}
			System.out.println();
		}

		
//		=================================================
		System.out.println("============Matrix After Rotation===================");
		for(int j=0; j<rowsOrColumn; j++) {
			for(int i=rowsOrColumn-1; i>=0;i--) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
//		=================================================
		
	
	
	
	}

}
