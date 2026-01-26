import java.util.Scanner;
public class main40 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int originalnum = num;
        int sum = 0;
        while(num != 0){
            int rem = num %10;
            sum += rem;
            num/=10;
        }
        if(originalnum % sum == 0){
            System.out.println("The no is harshad");
        }
        else{
            System.out.println("The no is not Niven");
        }
    }
}