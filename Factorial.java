import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number= scanner.nextInt();
		scanner.close();
		
		long fact=1;
		
		if(number>0) {
			for(int i=1; i<=number; i++) {
				fact=fact*i;
				
			}
			System.out.println("Factorial of "+number+" is "+fact);
			
		}
		else {
			System.out.println("Invalid Number");
		}

	}

}
