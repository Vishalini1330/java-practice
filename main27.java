import java.util.Scanner;
public class main27{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int count = 0;
        while(n!=0){
            count++;
            n/=10;

        }
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += Math.pow(rem,count);
            n /= 10;
        }
        System.out.println(sum);
        if(sum == n){
            System.out.println("amstrong no");
        }
        else{
            System.out.println("the given no is not a amstrong no");
        }
        
    }
}