import java.util.Scanner;
public class main23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}