import java.util.Scanner;
public class main97{
    public static void main(String[] args){
        int n=6;
        Factorial obj = new Factorial(n);
        obj.calc();
    }
}
class Factorial{
    int n,fact;
    Factorial(int n){
        fact=1;
        this.n=n;
    }
    public void calc(){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("factorial= " +fact);
    }
}