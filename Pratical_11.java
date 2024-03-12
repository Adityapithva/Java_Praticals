class Shape{
    float radius,lenght,width;
    public void area(float radius){
        float circleArea = 3.14f * radius * radius;
        System.out.println("Area of circle is :"+circleArea);
    }
    public void area(float lenght,float width){
        float rectangleArea = lenght * width;
        System.out.println("Area of rectangle is :"+rectangleArea);
    }
}
public class Pratical_11 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area(7.0f);
        obj.area(10.0f,15.0f);
    }
}
