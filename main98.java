import java.util.Scanner;
class example{
    static String college = "HICET";
    String name;
    example(String name){
        this.name=name;
    }
    public void disp(){
        System.out.print(name + " studies@ " + college);
    }
    public static void main(String[] args){
        example obj = new example("ramya");
        obj.disp();
    }
}