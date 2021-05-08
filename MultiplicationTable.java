import java.util.Scanner;

public class MultiplicationTable {
    public void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();

        System.out.println("Enter the Range: ");
        int range=scanner.nextInt();
        scanner.close();

        for(int i=1; i<=range; i++){
            System.out.println(number+"*"+i+" = "+number*i);
        }
    }
}
