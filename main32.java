import java.util.Scanner;
public class main{
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(num>0){
            if(num % 2 == 0){
             System.out.println(num + " is a even no");
            }
            else{
            System.out.println(num +" is odd no");
            }
        }
    }
}