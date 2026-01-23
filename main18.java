import java.util.Scanner;
public class main18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of litres to fill the tank: ");
        double litres = in.nextDouble();
        System.out.println("Enter the distance covered: ");
        double distance = in.nextDouble();
        if(litres>0 && distance>0){
            System.out.println("(Litres/100KM)");
            double consumption = (litres/distance)*100;
            System.out.println(consumption);
            System.out.println("(Miles/gallons)");
            double consumption2 = (distance*0.6214)/(litres*0.2642);
            System.out.println(consumption2);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}