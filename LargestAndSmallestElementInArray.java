import java.util.Scanner;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter range of the array: ");
		int range=scanner.nextInt();
		int[] array=new int[50];
		System.out.println("Elements of Array: ");
		for(int i=0; i<range; i++) {
			array[i]=scanner.nextInt();
		}
		
		int firstElement=array[0];
		
		for(int i=0; i<range; i++) {
			if(firstElement<array[i]) {
				firstElement=array[i];
			}
		}
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
