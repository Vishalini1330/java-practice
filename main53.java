import java.util.*;
public class main53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        String bin = in.next();
        while(bin.length()%3 != 0)
        {
            bin = "0" + bin;
        }
        String oct = " ";
        for(int i=1;i<=bin.length();i++){
            int value=0;
            value += bin.charAt(i)-'0'*4;
            value +=bin.charAt(i+1)-'0'*2;
            value += bin.charAt(i+2)-'0'*1;
            oct = oct + value;
        }
        System.out.println(oct);
    }
}