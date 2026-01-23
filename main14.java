import java.util.Scanner;
public class main14{
    public static void main(String[] args){
       
        Scanner in = new Scanner(System.in);
        System.out.println("enter salary: ");
        int salary = in.nextInt();
        System.out.println("enter performance score: ");
        int score = in.nextInt();
        int hike=0;
        
        if(score>=90){
            hike = 15;
           
        }

        else if(score>=80){
            hike = 12;
            
        }

        else if(score>=70){
            hike = 8;
           
        }
        else if(score>=60){
            hike = 5;
            
        }
        int percentage = salary * hike/100;
        int newSalary = salary + percentage;
        System.out.println("final salary is: "+ newSalary);
    }
}