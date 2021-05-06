

import java.util.Scanner;

public class PrintingASCIIValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a character:: ");

        char p = in.next().charAt(0);
        int pAscii = p;
        
		System.out.println("ASCII value of "+p +" is "+pAscii );
		in.close();

		

	}

}
