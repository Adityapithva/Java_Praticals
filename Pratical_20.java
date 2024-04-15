abstract class Shape{
    abstract public void area();
}
class Triangle extends Shape{
    int base,height;
    Triangle(int b,int h){
        base = b;
        height = h;
    }
    public void area(){
        System.out.println(0.5 * base * height);
    }
}
class Rectangle extends Shape{
    int l,h;
    Rectangle(int l,int h){
        this.h = h;
        this.l = l;
    }
    public void area(){
        System.out.println(l * h);
    }
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    public void area(){
        System.out.println(3.14f * r * r);
    }
}
public class Pratical_20 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10,20);
        t.area();
        Rectangle r = new Rectangle(10, 20);
        r.area();
        Circle c = new Circle(5);
        c.area();
    }
}
