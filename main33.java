import java.util.Scanner;
public class main33 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = in.nextInt();
       int rem;
       while(num !=0){
           rem = num % 10;
           System.out.print(rem);
           num/=10;
       }
    }
}