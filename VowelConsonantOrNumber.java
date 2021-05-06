import java.util.Scanner;

public class VowelConsonantOrNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the value: ");
		char ch=scanner.next().charAt(0);
		scanner.close();
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("It's Vowel");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It's Number");
		}
		else {
			System.out.println("It's Consonant");
		}

	}

}
