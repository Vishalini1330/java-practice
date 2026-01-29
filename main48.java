import java.util.Scanner;
public class main48{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int num=0;
            for(int j=0;j<i;j++){
                num = num*10;
                num = num + 9;
            }
            sum = sum+num;
            System.out.println(sum);
        }
    }
}