import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number to Check: ");
		int numberToCheck=scanner.nextInt();
		scanner.close();
		
		
		int i;
		boolean isPrime=true;
		
		for(i=2; i<=numberToCheck/2; i++) {
			if(numberToCheck%i==0) {
				isPrime=false;
				break;
			}
						
			
		}
		if(isPrime) {
			System.out.println(numberToCheck+" is Prime Number");
		}else {
			System.out.println(numberToCheck+" is Not Prime Number");
		}
		
		
		
	}
}


