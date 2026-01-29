import java.util.Scanner;
public class main52{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int dec = in.nextInt();
        String oct = " ";
        while(dec>0){
            int rem = dec % 8;
            oct = rem+oct;
            dec /= 8;
        }
       System.out.print(oct); 
    }
}