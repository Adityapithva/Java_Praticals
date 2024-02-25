class Rectangle{
    int height;
    int width;
    Rectangle(int h,int w){
        height = h;
        width = w;
    }
    void display(){
        System.out.println("Height:"+height+" Width:"+width);
    }
}
public class Pratical_7 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        r.display();
    }
}