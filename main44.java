import java.util.Scanner;
public class main44 {
    public static void main(String[] args) {
       Scanner in =  new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = in.nextInt();
       if(num == 0){
           System.out.println("0");
           return;
        }
        String binaryno = " ";
        while(num>0){
            int rem = num % 2;
            binaryno = rem + binaryno;
            num /= 2;
       }
       System.out.print(binaryno);
    }
}