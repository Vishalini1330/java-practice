import java.util.Scanner;
public class main89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String s1 = in.nextLine();
        System.out.print("Enter second number: ");
        String s2 = in.nextLine();
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        int carry = 0, num = 0;
        String add=" ";
        while (n1>0||n2>=0||carry==1) {
            num=0;
            if (n1>0&&n2>=0)
                num=(s1.charAt(n1)-'0')+(s2.charAt(n2)-'0')+carry;
            else if (n1>=0) 
                num=(s1.charAt(n1)-'0')+carry;
            else if(n2>=0)
                num=(s2.charAt(n2)-'0')+carry;
            else
                num=carry;
            carry=num/10;
            num=num%10;
            add=num + add;
            n1--;
            n2--;
        }
        System.out.println(add);
    }
}