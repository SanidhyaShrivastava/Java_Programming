import java.util.Scanner;

public class LowerCaseCharacterToUpperCase {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char character=scanner.next().charAt(0);
		
		scanner.close();
		
		if(Character.isLowerCase(character)) {
			System.out.println("The Reverse of "+character+" = "+Character.toUpperCase(character));
		}
		else {
			System.out.println("The Reverse Case Of "+character+ " = "+Character.toLowerCase(character));
		}
	}

}
