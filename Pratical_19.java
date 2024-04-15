interface int1{
    public void method1();
}
interface int2{
    public void method2();
}
class Example implements int1,int2{
    public void method1(){
        System.out.println("This is interface 1");
    }
    public void method2(){
        System.out.println("This is interface 2");
    }
}
public class Pratical_19 {
    public static void main(String[] args) {
        Example e = new Example();
        e.method1();
        e.method2();
    }
}
