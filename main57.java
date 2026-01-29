import java.util.Scanner;
public class main57{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number1: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                for(int k=0;k<j;k++){
                    System.out.print(j+k);
                }
                
            }
            System.out.println(" ");
        }
    }
}