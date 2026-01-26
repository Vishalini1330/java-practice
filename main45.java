import java.util.Scanner;
public class main45 {
    public static void main(String[] args) {
       Scanner in =  new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = in.nextInt();
       int largest = 0;
       while(num > 0){
           int rem = num % 10;
           if(rem>largest){
               largest = rem;
           } 
           num /= 10;
       }
       System.out.print(largest + "is the largest digit");
    }
}