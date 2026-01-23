import java.util.Scanner;
public class main16{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought: ");
        int pizzas = in.nextInt();
        System.out.println("Enter the no of puffs bought: ");
        int puffs = in.nextInt();
        System.out.println("Enter the no of cool drinks bought: ");
        int cooldrinks = in.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas: " + pizzas);
        System.out.println("No of puffs: " + puffs);
        System.out.println("No of cool drinks: " + cooldrinks);
        int total = (pizzas * 100 + puffs * 20 + cooldrinks * 10);
        System.out.println("Total price: " + total);
    }
}