
import java.util.Scanner;

public class AddingTwoMatrixOfSameDimension {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=scanner.nextInt();
		
		System.out.print("Enter no. of column: ");
		int column=scanner.nextInt();
		
		
		
		System.out.println("==========First Matrix============");
		int[][] firstMatrix=new int[rows][column];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Enter element at position ["+(i+1)+(j+1)+"]: ");
				firstMatrix[i][j]=scanner.nextInt();
			}
		}
		
		
		
		
		System.out.println("============Second Matrix==========");
		int[][] secondMatrix=new int[rows][column];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Enter element at position ["+(i+1)+(j+1)+"]: ");
				secondMatrix[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		
		
		
//		=======================Calculation=============================
		int[][] sum=new int[rows][column];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
			}
		}
//		=================================================================
		
		
		
		
		System.out.println("===========Addition of Matrix========");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
