import java.util.Scanner;
public class main11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter percentage :");
        int percentage = in.nextInt();
        System.out.println("enter attendance: ");
        int attendance = in.nextInt();
        if(percentage>=85 && attendance>=90){
            System.out.println("distinction");
        }
        else if(percentage>=70 && attendance>=80){
            System.out.println("first class");
        }
        else if(percentage>=60 && attendance>=75){
            System.out.println("second class");
        }
        else if(percentage>=50 && attendance>=75){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
             }
    }
}