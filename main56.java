import java.util.Scanner;
public class main56{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        String oct = in.next();
        char value =' ';
        int num;
        for(int i=0;i<oct.length();i++){
            value = oct.charAt(i);
            num = value - '0';
            String bin = "";
            while(num>0){
                int rem = num%2;
                bin = rem + bin;
                num/=2;
            }
            while (bin.length() < 3) {
                bin = "0" + bin;
            }
            System.out.print(bin);
        }
    }
}