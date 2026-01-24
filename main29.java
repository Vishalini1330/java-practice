import java.util.Scanner;
public class main29{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("No of fabonacci terms: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
        }
      
    }
}