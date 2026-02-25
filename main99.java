import java.util.Scanner;
class main{
    public static void main(String[] args){
        example obj1 = new example();
        example obj2 = new example();
        example obj3 = new example();
        example obj4 = new example();
        System.out.println("objects created: " + example.count);
        example.disp();
    }
}
class example{
    static int count =0;
    example(){
        count=count+1;
    }
    public static void disp(){
        System.out.print("objects created: " + count);
    }
}
