import java.util.Scanner;
public class main7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter letter: ");
        char n = in.nextLine().charAt(0);
        if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
            System.out.println("vowel");
        }
    }
}