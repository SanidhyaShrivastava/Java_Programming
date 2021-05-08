import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
	        Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int number=scanner.nextInt();

	        System.out.print("Enter the Range: ");
	        int range=scanner.nextInt();
	        scanner.close();

	        for(int i=1; i<=range; i++){
	            System.out.println(number+"*"+i+" = "+number*i);
	        }
	    

	}

}
