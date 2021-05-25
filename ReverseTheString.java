/**
 * Class Untitled
 */


import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
//		---------------------Method 1-------------------------
//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("Enter the Word: ");
//		String word=scanner.nextLine();
//		scanner.close();
//		
//		StringBuffer reverse=new StringBuffer(word).reverse();
//		System.out.println("Reverse Word is: "+reverse);

//		--------------------Method 2--------------------------
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Word: ");
		String word=scanner.nextLine();
		scanner.close();
		
		int length=word.length();
		String reverse="";
		for(int i=length-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		System.out.println("---------------------------------");
		System.out.println("Reverse Word = "+reverse);
		
	}
}
