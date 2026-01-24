import java.util.Scanner;
public class main26{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = in.nextInt();
        int sum = 0;
        while(n!=0){
           int rem = n % 10;
           sum += rem;
           n/=10;
        }
        System.out.println(sum);
    }
}