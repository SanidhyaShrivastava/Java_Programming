import java.util.Scanner;

public class SumOfnInputNumberInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ente size of array: ");
		int range=scanner.nextInt();
		
		int[] array=new int[range];
		int sum=0;
		System.out.print("Enter numbers in array: ");
		for(int i=0; i<range; i++) {
			array[i]=scanner.nextInt();
			sum +=array[i];
		}
		
		System.out.println("Sum of all inputs = "+sum);
		
		scanner.close();
	}

}
