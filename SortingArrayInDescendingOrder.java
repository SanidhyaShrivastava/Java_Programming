

import java.util.Scanner;



public class SortingArrayInDescendingOrder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter range of Array: ");
		int range=scanner.nextInt();
		
		int[] array=new int[range];
		
		
		for(int i=0; i<range; i++) {
			array[i]=scanner.nextInt();
		}scanner.close();
		System.out.println("---------------Unsorted Array---------------");
		for(int i=0; i<array.length; i++) {
			System.out.println("Element "+i+" contents "+array[i]);
		}
		int temp;
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;	
				}
			}
		}
		System.out.println("----------------Sorted Array---------------");
		int i;
		for(i=0; i<range-1; i++) {
			System.out.println("Element "+i+" contents "+array[i]);
		}
		System.out.println("Element "+i+" contents "+array[range-1]);
		

	}

}
