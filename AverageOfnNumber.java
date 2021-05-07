import java.util.Scanner;

public class AverageOfnNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Number Of Elements: ");
		int numberOfElements=scanner.nextInt();
		
		int average=0;
		
		System.out.println("Enter "+numberOfElements+" number one by one: ");
		
		for(int i=0; i<numberOfElements; i++) {
			
			int totalInputs=scanner.nextInt();
			
			average +=totalInputs;
			
		}
		average /=numberOfElements;
		
		System.out.println("----------------------------------");
		System.out.println("Average of "+numberOfElements+" number is: "+average);
		
		scanner.close();
	}

}
