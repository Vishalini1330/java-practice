import java.util.Scanner;
public class main6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        if(n%17 ==0){
            System.out.println("divisible by 17");
        }
    }
}

import java.util.Scanner;
public class main6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter marks: ");
        int marks = in.nextInt();
        if(marks>=50){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
             }
    }
}