import java.util.Scanner;
public class main3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float farenheit = in.nextFloat();
        System.out.println("Enter farenheit: "+ farenheit);
        float celcius =(farenheit - 32) * 5/9;
        System.out.println("Celcius is: "+ celcius);
    }
}