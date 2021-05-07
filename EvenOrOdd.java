import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number=scanner.nextInt();
		scanner.close();
		System.out.println("----------------------------");
		if(number%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}
