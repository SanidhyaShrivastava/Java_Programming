import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Principal Value= ");
		double principal=scanner.nextDouble();
		
		System.out.print("Enter Rate Value= ");
		double rate=scanner.nextDouble();
		
		System.out.print("Enter Time Value= ");
		double time=scanner.nextDouble();
		
		scanner.close();
		double simpleInterest;
		simpleInterest=(principal*rate*time)/100;
		System.out.println("-------------------------------");
		System.out.println("Simple Interest = "+simpleInterest);

	}

}
