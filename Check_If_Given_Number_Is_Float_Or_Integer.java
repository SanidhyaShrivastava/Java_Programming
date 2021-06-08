import java.util.Scanner;

public class Check_If_Given_Number_Is_Float_Or_Integer {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the number: ");
		double number=scanner.nextDouble();
		scanner.close();
		
		System.out.println("==============================");
		
		
		int check=(int)number;
		
		if(check==number) {
			System.out.println("Number is Integer");
		}
		else {
			System.out.println("Number is Float/Double");
		}

	
	
	
	}

}
