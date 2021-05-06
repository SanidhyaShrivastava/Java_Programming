import java.util.Scanner;

public class AngleOfTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first angle: ");
		double a=scanner.nextDouble();
		
		System.out.print("Enter second angle: ");
		double b=scanner.nextDouble();
		
		scanner.close();
		
		double c=180 - (a+b);
		System.out.println("-------------------------");
		System.out.println("Third Angle is: "+c);

	}

}
