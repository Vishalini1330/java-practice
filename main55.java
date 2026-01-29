import java.util.Scanner;
public class main55{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        String hex = in.next();
        char value = ' ';
        for(int i=0;i<hex.length();i++){
            value = hex.charAt(i);
            int num;
            if(value>='0'&&value<='9'){
                 num=value-'0';
            }
            else{
                 num=(value-'A')+10;
            }
            String bin = "";
            while(num>0){
                int rem = num%2;
                bin = rem + bin;
                num/=2;
            }
            while (bin.length() < 4) {
                bin = "0" + bin;
            }
            System.out.print(bin);
        }
        
    }
}