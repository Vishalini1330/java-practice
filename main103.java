import java.util.Scanner;
class Shape{
    int square,rectangle,circle;
    public void square(int a){
        this.square = a*a;
    }
    public void rectangle(int l, int b){
        this.rectangle = l*b;
    }
    public void circle(int r){
        this.circle = 3.14*r*r;
    }
}
class Square extends Shape{
    public void display(){
        System.out.println("Area of square is: "+square);
    }
}
class Rectangle extends Shape{
    public void display(){
        System.out.println("Area of rectangle is: "+rectangle);
    }
}
class Circle extends Shape{
    public void display(){
        System.out.println("Area of circle is: "+circle);
    }
    public static void main(String[] args){
        Square s = new Square(5);
        s.display();
        Rectangle r = new Rectangle(2,4);
        r.display();
        Circle c = new Circle(4);
        c.display();
    }
}