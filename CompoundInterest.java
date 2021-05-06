import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Principal Value= ");
		double principal=scanner.nextDouble();
		
		System.out.print("Enter Rate Value= ");
		double rate=scanner.nextDouble();
		
		System.out.print("Enter Time Value= ");
		double time=scanner.nextDouble();
		
		scanner.close();
		double compoundInterest;
		
		compoundInterest=principal*(Math.pow((1+rate/100),time));
		System.out.println("----------------------------");
		System.out.println("Compound Interest= "+compoundInterest);

	}

}
