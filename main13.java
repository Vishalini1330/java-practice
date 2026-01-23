import java.util.Scanner;
public class main13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter speed: ");
        int speed = in.nextInt();
        if(speed<=60){
            System.out.println("No fine");
        }
        else if(speed>60 && speed<=80){
            System.out.println("1000 rupees fine");
        }
        else if(speed>80 && speed<=100){
            System.out.println("2000 rupees fine");
        }
        else if(speed>100 && speed<=120){
            System.out.println("5000 rupees fine");
        }
        else{
            System.out.println("license suspended");
        }
    }
}