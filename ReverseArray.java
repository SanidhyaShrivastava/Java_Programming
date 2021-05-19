import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter range of Array: ");
		int range=scanner.nextInt();
		
		int[] array=new int[range];
		System.out.println("Enter Array Value: ");
		for(int i=0; i<range; i++) {
			array[i]=scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("---------------Original Array--------------------");
		for(int i=0; i<range; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		System.out.println("---------------Reversed Array-----------------");
		
		for(int i=range-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}

	}

}
