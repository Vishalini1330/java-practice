import java.util.Scanner;
public class main38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int originalnum = num;
        int sum =0;
        while(num!=0){
            int rem = num%10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum == originalnum){
            System.out.println(originalnum + " is a strong no");
        }
        else{
            System.out.println(originalnum + " is not a strong no");
        }
    }    
}