import java.util.Scanner;
public class main12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter no.of units: ");
        int units = in.nextInt();
        if(units<=100){
            System.out.println("rupees 1");
        }
        else if(units>100 && units<=200){
            System.out.println("rupees 2");
        }
        else if(units>200 && units<=300){
            System.out.println("rupees 3");
        }
        else{
            System.out.println("rupees 5 per unit");
        }
    }
}