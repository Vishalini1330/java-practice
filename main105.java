import java.util.Scanner;
class A{
    int a;
    A(){
        a=0;
    }
    public void get(int a){
        this.a=a;
        System.out.print("a= "+a);
    }
}
class B extends A{
    int b;
    B(){
        super();
        b=0;
    }
    public void get(){
        Scanner in = new Scanner(System.in);
        b=in.nextInt();
    }
    public static void main(String[] args){
        B obj = new B();
        obj.get(10);
        obj.get();
        System.out.println("a= "+ obj.a);
        System.out.println("b= "+ obj.b);
    }
}