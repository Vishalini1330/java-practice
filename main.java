import java.util.Scanner;
public class main{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
        int r = in.nextInt();
         System.out.println("Enter radius: " + r);
        double pi = 3.14;
        System.out.println("Area of circle is: " + (pi*r*r));
    }
}