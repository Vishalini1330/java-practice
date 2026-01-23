import java.util.Scanner;
public class main2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a: " + (a = in.nextInt()));
        System.out.println("enter b: " + (b = in.nextInt()));
        System.out.println("enter c: " + (c = in.nextInt()));
        int perimeter = a + b + c;
        System.out.println("Perimeter of a triangle is: " + perimeter);
    }
}