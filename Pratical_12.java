class Example{
    Example(){
        System.out.println("This is default constructor...!");
    }
    Example(int a){
        System.out.println("This is constructor with parameter...!");
    }
}
public class Pratical_12 {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(10);
    }
}
