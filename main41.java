import java.util.Scanner;
public class main41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=2;j<i;j++){
                if(i%j != 0){
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}