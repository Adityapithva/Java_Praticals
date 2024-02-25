class Rectangle{
    int height;
    int width;
    Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }
    Rectangle(){
        this(0,0);
    }
    void display(){
        System.out.println("Height:"+height+" Width:"+width);
    }
}
public class Pratical_8 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,20);
        rect.display();
    }
}
