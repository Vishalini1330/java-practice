import java.util.Scanner;
public class main10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter year :");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
             }
    }
}