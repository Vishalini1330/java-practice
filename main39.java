import java.util.Scanner;
public class main39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int sqnum = num*num;
        int rem = sqnum%10;
        if(rem == num){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not a Automorphic");
        }
    }    
}