import java.util.Scanner;

public class PowerOfAnyNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter base value: ");
		double base=scanner.nextDouble();
		
		System.out.print("Enter Exponent value: ");
		double exponent=scanner.nextDouble();
		
		scanner.close();
		
		double result= Math.pow(base, exponent);
		System.out.println("------------------------");
		System.out.println("Power of number is: "+result);

	}

}
