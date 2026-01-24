import java.util.Scanner;
public class main30{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++){
            if(num % i != 0){
                System.out.println(num + " is a prime number");
                break;
            }
            else{
                System.out.println(num + " is not a prime no");
                break;
            }
        }
    }
}