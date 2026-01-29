import java.util.Scanner;
public class main54{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        String bin = in.next();
        while(bin.length()%4 != 0)
        {
            bin = "0" + bin;
        }
        String hex = "";
        for(int i=0;i<bin.length();i+=4){
            int value=0;
            value += (bin.charAt(i)-'0')*8;
            value += (bin.charAt(i+1)-'0')*4;
            value +=(bin.charAt(i+2)-'0')*2;
            value += (bin.charAt(i+3)-'0')*1;
            if(value>=10){
                hex += (char)((value-10)+'A');
            }
            else{
            hex = hex + value;
            }
        }
        System.out.println(hex);
    }
}