import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the height: ");
		double height=scanner.nextDouble();
		
		System.out.print("Enter the base: ");
		double base=scanner.nextDouble();
		
		scanner.close();
		
		double area=(base*height)/2;
		
		System.out.println("---------------------------");
		System.out.println("Area of Triangle is: "+area);
	}

}
