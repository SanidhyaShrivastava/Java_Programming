import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number= scanner.nextInt();
		scanner.close();
		
		int lastDigit;
		int reverseNumber=0;
		
		while(number>0) {
			lastDigit=number%10;
			reverseNumber +=lastDigit;
			number /=10;
			
		}
		System.out.println("----------------------");
		System.out.println("Sum is: "+reverseNumber);

	}

}
