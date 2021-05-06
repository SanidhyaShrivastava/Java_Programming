import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double number=scanner.nextDouble();
		
		scanner.close();
		
		double root=Math.sqrt(number);
		System.out.println("----------------------");
		System.out.println("Square root of "+number+" is "+root);
		
	}

}
