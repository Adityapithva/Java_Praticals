class Sample{
    static int a = 10;
    static int b = 20;
    static void add(int a, int b){
        System.out.println(a+b);
    }
}
public class Pratical_9 {
    public static void main(String[] args) {
        Sample.add(10, 10);
        System.out.println(Sample.a + Sample.b);
    }
}
