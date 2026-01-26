import java.util.Scanner;
public class main43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum += i;
        }
        System.out.print(sum);
    }
}