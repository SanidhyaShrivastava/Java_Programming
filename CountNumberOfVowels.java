import java.util.Scanner;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Word: ");
		String word=scanner.nextLine();
		scanner.close();
		
		int length=word.length();
		int count=0;
		
		for(int i=0;i<length;i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' ||word.charAt(i)=='u' 
					|| word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' ||word.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Number of Vowels = "+count);

	}

}
