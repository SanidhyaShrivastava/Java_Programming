import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number=scanner.nextInt();
		scanner.close();
		System.out.print("Factor of "+number+" = ");
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
