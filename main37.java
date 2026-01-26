import java.util.Scanner;
public class main37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int originalnum = num;
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum += i;
            }
            if(sum == originalnum){
                System.out.println("Perfect number");
                break;
            }
            else{
                System.out.println("Not a perfect number");
                break;
            }
       }
    }
}