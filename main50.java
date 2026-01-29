import java.util.Scanner;
public class main50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("#");
        }
        System.out.println(" ");
        for(int i=2;i<n;i++){
            System.out.print("#");
            for(int j=2;j<n;j++){
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for(int i=1;i<=n;i++){
            System.out.print("#");
        }
        
    }
}