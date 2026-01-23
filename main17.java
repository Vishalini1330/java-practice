import java.util.Scanner;
public class main17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE: ");
        int num1 = in.nextInt();
        System.out.println("Enter the no of students placed in ECE: ");
        int num2 = in.nextInt();
        System.out.println("Enter the no of students placed in MECH: ");
        int num3 = in.nextInt();
        if(num1>0 || num2>0 || num3>0){
            if (num1 > num2 && num1 > num3) {
                System.out.println("Highest placement" + "CSE");
            }
            else if (num2 > num1 && num2 > num3) {
                System.out.println("Highest placement" + "ECE");
            }
            else if(num3>num1 && num3>num2){
                System.out.println("Highest placement" + "MECH");
            }
            else if (num1 == num2 && num2 == num3){
                System.out.println("None of the departments has got the highest placement");
            }
            else{
                System.out.println("Input is invalid");
            }
        }
    }
}