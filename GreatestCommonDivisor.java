import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
//		-----------------------Method 1----------------------------		
//		System.out.println(getGreatestCommonDivisor(15,20));
//	}public static int getGreatestCommonDivisor(int first, int second){
//        if(first<10 || second<10){
//            return -1;
//        }
//
//        while(first!=second){
//
//            if(first>second){
//                first=first-second;
//            }
//            else{
//                second=second-first;
//            }
//        }
//        return second;
//			------------------------Method 2---------------------------
		
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
		System.out.println("Greatest Common of "+num1+" and "+num2+" = "+greatestCommonDivisor);
    }

}
