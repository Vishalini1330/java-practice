import java.util.Scanner;
public class main25{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}