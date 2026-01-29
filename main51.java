import java.util.Scanner;
public class main51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int dec = in.nextInt();
        String hex = " ";
        while(dec>0)
        {
            int rem = dec % 16;
            if(rem<10){
                hex = rem+hex;
            }
            else if(rem >=10){
                hex = (char)((rem-10)+'A')+hex;
            }
            dec = dec/16;
        }
       System.out.println(hex); 
    }
}