import java.util.Scanner;

public class NormalAndTraceOfSquareMatrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter no. of rows or column : ");
		int rowsOrColumn=scanner.nextInt();
		
		
		int[][] matrix=new int[rowsOrColumn][rowsOrColumn];
		double squareOfMatrix=0;
		double sumofElements=0;
		
//		==============Input for matrix====================		
		System.out.println("Input for Matrix: ");
		for(int i=0; i<rowsOrColumn; i++) {
			for(int j=0; j<rowsOrColumn; j++) {
				matrix[i][j]=scanner.nextInt();
				squareOfMatrix=matrix[i][j] * matrix[i][j];
				sumofElements +=squareOfMatrix;
			}
		}
//		===========================================
		scanner.close();
		
		
		
		
//		==================Printing matrix==================	
		System.out.println("==============Matrix============== ");
		for(int i=0; i<rowsOrColumn; i++) {
			for(int j=0; j<rowsOrColumn; j++) {
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
//		=========================================================
		
		
		
		
//		=====================Normal of matrix===================
		double normal =(double) Math.sqrt(sumofElements);
		System.out.println("\n=======================");
		System.out.println("Normal of Matrix = "+normal);
//		=======================================================
		
		
		
		
//		======================Trace===========================
		int trace=0;
		for(int i=0; i<rowsOrColumn; i++) {
			trace += matrix[i][i];
		}
		System.out.println("Trace of Matrix is: "+trace);
		
		
		
		
		
		
	}

}
