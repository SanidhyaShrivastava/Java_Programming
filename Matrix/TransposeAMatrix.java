import java.util.Scanner;


public class TransposeAMatrix {

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
//		=================================================

		
		
		
		
//		==================Transpose======================
		int[][] transpose=new int[column][rows];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				transpose[j][i]=matrix[i][j];
			}
		}

		
		
//		===============Printing Transpose Matrix==========
		System.out.println("==========Transpose Of Matrix========");
		for(int i=0; i<column; i++) {
			for(int j=0; j<rows; j++) {
				System.out.print(transpose[i][j]+"  ");
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	}

}
