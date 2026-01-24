import java.util.Scanner;
public class main21{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x&y: ");
        int x =  in.nextInt();
        int y = in.nextInt();
        System.out.println("Enter the arithmetic operator: ");
        char a = in.next().charAt(0);
        switch(a)
        {
            case '+':
                System.out.println("Addition: " + (x + y));
                break;
            case '-':
                System.out.println("Subtraction: " + (x - y));
                break;
            case '*':
                System.out.println("Multiplication: " + (x * y));
                break;
            case '/':
                System.out.println("Division: " + (x / y));
                break;
            case '%':
                System.out.println("Modulo: " + (x % y));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}