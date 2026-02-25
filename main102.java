import java.util.Scanner;
class Name{
    String name;
    public void getname(String name){
        Scanner in = new Scanner(System.in);
        System.out.println("enter name: ");
        name = in.nextLine();
        this.name = name;
    }
}
class Age extends Name{
    int age;
    public void getage(int age){
        Scanner in = new Scanner(System.in);
        System.out.println("enter age: ");
        age = in.nextInt();
        super.getname(name);
        this.age = age;
    }
}
class print{
    public void display(Age obj){
        System.out.println(obj.name + "is" + obj.age);
    }
    public static void main(String[] args){
        Age obj = new Age();
        obj.getage(age);
        print p = new print();
        p.display(obj);
    }
}