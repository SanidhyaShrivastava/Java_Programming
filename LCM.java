import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter two Positive integers: ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		scanner.close();
		int greatestCommonDivisor=1;
		
		for(int i=1; i<=num1 && i<=num2; i++) {
			
			if(num1%i==0 && num2%i==0) {
				greatestCommonDivisor=i;
			}
		}
		int leastCommonFactor= (num1*num2)/greatestCommonDivisor;
		System.out.println("LCM of "+num1+" and "+num2+" = "+leastCommonFactor);

	}

}
