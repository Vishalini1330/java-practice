import java.util.Scanner;
public class main35{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter a num2: ");
        int num2 = in.nextInt();
        int temp;
        while(num2 != 0){
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD is: " + num1);

    }
}