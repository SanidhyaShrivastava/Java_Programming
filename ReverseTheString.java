/**
 * Class Untitled
 */

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
//		------------------Method 1---------------------------
//		String reverse=reverseString("sas nijf fjd");
//		System.out.println("Reverse String is: "+reverse);
//	}
//	public static String reverseString(String str){  
//	    StringBuilder sb=new StringBuilder(str).reverse();
//	   
//	    return sb.toString();  
//	}
//		---------------------Method 2-------------------------
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Word: ");
		String word=scanner.nextLine();
		scanner.close();
		
		StringBuffer reverse=new StringBuffer(word).reverse();
		System.out.println("Reverse Word is: "+reverse);
	}
}
