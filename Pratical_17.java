class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Pratical_17 extends Vehicle{
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        Pratical_17 obj = new Pratical_17();
        obj.run();
    }
}
