import java.util.Scanner;

public class N_PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("Enter the Range of Number: ");
		int range=scanner.nextInt();
		scanner.close();
		
		int i;
		int j;
		boolean isPrime;
		
		for(i=1;i<=range;i++) {
			
			if(i==1) {
				continue;
			}
			isPrime=true;
			
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(" "+i);
			}
		}
	}

}
