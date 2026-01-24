import java.util.Scanner;
public class main24{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
            
        }
    System.out.println(sum);
    }

}