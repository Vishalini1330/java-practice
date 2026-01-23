import java.util.Scanner;
public class main4{
    public static void main(String[] args){
        char c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter h or t: ");
        c = in.nextLine().charAt(0);
        if(c=='h')
            System.out.println("you are lucky");
    }
}