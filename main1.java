import java.util.Scanner;
public class main1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float celcius = in.nextFloat();
        System.out.println("Enter celcius: " + celcius);
        float farenheit = (celcius * 9/5) +32;
        System.out.println("Farenheit is: " + farenheit);
    }
}