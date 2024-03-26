class Parent{
    public void pfun(){
        System.out.println("Inside Parent class");
    }
}
class Child extends Parent{
    public void cfun(){
        System.out.println("Inside Child class");
    }
}
public class Pratical_14 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.pfun();
        obj.cfun();
    }
}
