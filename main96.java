import java.util.Scanner;
public class main96{
    public static void main(String[] args){
        Sum obj = new Sum();
        obj.setter(5,10);
        System.out.print("a= "+ obj.get_a());
    }
}
class Sum{
    private int a,b,c;
    public void setter(int x,int y){
        this.a=x;
        this.b=y;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public void disp(){
        c=a+b;
        System.out.print(c);
    }
}