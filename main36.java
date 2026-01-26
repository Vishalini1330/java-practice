import java.util.Scanner;
public class main36{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1 = in.nextInt();
        int originalnum1 = num1;
        System.out.println("Enter a num2: ");
        int num2 = in.nextInt();
        int originalnum2 = num2;
        int temp;
        while(num2 != 0){
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int lcm = (originalnum1 * originalnum2) / num1;
        System.out.println("LCM is: " + lcm);

    }
}