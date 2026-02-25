abstract class Shape{
    double area;
    abstract public void calc();
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    public void calc(){
        area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }
}
class main{
    public static void main(String[] args){
        Circle c = new Circle(10);
        c.calc();
    }
}