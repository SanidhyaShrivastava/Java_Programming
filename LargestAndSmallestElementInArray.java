import java.util.Scanner;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter range of the array: ");
		int range=scanner.nextInt();
		int[] array=new int[50];
		
		for(int i=0; i<range; i++) {
			System.out.print("Elements of Array: ");
			array[i]=scanner.nextInt();
		}
		
		int firstElement=array[0];
		
		for(int i=0; i<range; i++) {
			if(firstElement<array[i]) {
				firstElement=array[i];
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Largest Element = "+firstElement);
		
		int secondElement=array[0];
		
		for(int i=0; i<range; i++) {
			if(secondElement>array[i]) {
				secondElement=array[i];
			}
		}
		System.out.println("Smallest Element = "+secondElement);
		
		scanner.close();
	}

}
