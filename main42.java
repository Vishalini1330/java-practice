import java.util.Scanner;
public class main42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        int originalnum = num;
        int sqnum = num*num;
        int sum = 0;
        while(sqnum != 0){
            int rem = sqnum % 10;
            sum +=  rem;
            sqnum /= 10;
        }
        if(sum == originalnum){
            System.out.println("Neon no");
        }
        else{
            System.out.println("Not a Neon no");
        }
    }
}