import java.util.Scanner;
public class main34{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int originalnum = num;
        int rem ;
        int reverse = 0;
        while(num != 0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        if(reverse == originalnum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}