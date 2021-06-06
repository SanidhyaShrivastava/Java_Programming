import java.util.Scanner;



public class MultiplyingTwoMatrix {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=scanner.nextInt();
		
		System.out.print("Enter no. of column: ");
		int column=scanner.nextInt();
		
		
		
// 		================Input for First Matrix=========================
		System.out.println("Input for First Matrix: ");
		int[][] firstMatrix=new int[rows][column];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				firstMatrix[i][j]=scanner.nextInt();
			}
		}
//		================================================================			
		
		
//		==============Input for Second Matrix=======================		
		System.out.println("Input for Second Matrix: ");
		int[][] secondMatrix=new int[rows][column];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				secondMatrix[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
//		====================================================================		
		
		
		
		System.out.println("==========First Matrix============");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(firstMatrix[i][j]+"\t");
			}
			System.out.println();
		}
//		==============================================================
		
		
		
		System.out.println("============Second Matrix==========");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(secondMatrix[i][j]+"\t");
			}
			System.out.println();
		}
//		=======================================================		
		
		
//		=====================Multiplication============================
		
		int[][] multiply= new int[rows][column];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				multiply[i][j]=0;
				for(int k=0; k<column; k++) {
					multiply[i][j] += firstMatrix[i][k] * secondMatrix[k][j];  
				}
			}
		}
//		===================================================		
		
//		=====================Multiplication of Matrix======================
		System.out.println("===========Multiplication============= ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(multiply[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
