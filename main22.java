import java.util.Scanner;
public class main22{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        for(; i <= n; ){
            System.out.print(i + " ");
            i++;
        }
        for(i=2; i<=n; i+=2){
            System.out.println(i + " ");
        }
        
    }
}