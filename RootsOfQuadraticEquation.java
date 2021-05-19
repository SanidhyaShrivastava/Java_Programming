import java.util.*;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the value of a,b,c: ");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		scanner.close();
		
		double determinant= (b*b)- 4*a*c;
		double root1,root2;
		
		if(determinant>0) {
			root1= (-b +Math.sqrt(determinant))/(2*a);
			root2= (-b -Math.sqrt(determinant))/(2*a);
			
			System.out.printf("root 1 = %.2f and root 2 = %.2f",root1,root2);
		}
		else if (determinant==0) {
			root1=root2= (-b)/(2*a);
			System.out.printf("root1 = root2 = %.2f",root1);
		}
		else {
			double real= (-b)/(2*a);
			double imaginary= (Math.sqrt(-determinant))/(2*a);
			System.out.printf("root 1 = %.2f + %.2fi\n",real,imaginary);
			System.out.printf("\nroot 2 = %.2f - %.2fi\n",real,imaginary);
		}
		

	}

}
