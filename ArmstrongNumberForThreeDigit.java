import java.util.Scanner;

public class ArmstrongNumberForThreeDigit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=scanner.nextInt();
		scanner.close();
		
		int lastDigit=0;
		int reverseNum=0;
		int originalNumber=number;
		while(originalNumber!=0) {
			lastDigit=originalNumber%10;
			reverseNum +=(lastDigit*lastDigit*lastDigit);
			originalNumber /=10;
		}
		if(reverseNum==number) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}

	}

}
