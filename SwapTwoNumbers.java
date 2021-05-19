import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
//		-----------------------Method 1------------------------
		
		Scanner  scanner=new Scanner(System.in);
		System.out.println("----------Before Swapping--------------");
		System.out.print("Enter First Number: ");
		double num1=scanner.nextDouble();
		System.out.print("Enter Second Number: ");
		double num2=scanner.nextDouble();
		scanner.close();
		
		double temp;
		
		temp=num1;
		
		num1=num2;
		
		num2=temp;
		
		System.out.println("----------After Swapping--------------");
		System.out.println("First Number = "+num1);
		System.out.println("Second Number = "+num2);
		
		
 /*	Scanner  scanner=new Scanner(System.in);
		System.out.println("----------Before Swapping--------------");
		System.out.print("Enter First Number: ");
		double num1=scanner.nextDouble();
		System.out.print("Enter Second Number: ");
		double num2=scanner.nextDouble();
		scanner.close();
		
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		
		System.out.println("----------After Swapping--------------");
		System.out.println("First Number = "+num1);
		System.out.println("Second Number = "+num2);
		
		
 
*/
	}

}
