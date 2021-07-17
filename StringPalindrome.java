import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   	 System.out.print("Enter the String: ");
        String A=sc.next();
        sc.close();
        int length=A.length();
        String reverse="";
        
        for(int i=length-1; i>=0; i--){
            reverse += A.charAt(i);
        } 
        System.out.println("====================================");
            if(A.toLowerCase().equals(reverse.toLowerCase())){
                System.out.println("String is Palindrome");
            }
            else{
                System.out.println("String is not Palindrome");
            }

	}

}
