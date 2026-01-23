import java.util.Scanner;
public class main9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter amount :");
        int amount = in.nextInt();
        if(amount>=10000){
            System.out.println("debit 500");
        }
        else{
            System.out.println("debit 50");
             }
    }
}