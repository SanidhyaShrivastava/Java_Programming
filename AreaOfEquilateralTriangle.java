import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter length of side = ");
		double side=scanner.nextDouble();
		scanner.close();
		
		double area=((Math.sqrt(3)/4)*side*side);
		System.out.println("---------------------");
		System.out.println("Area of Equilateral = "+area);

	}

}
