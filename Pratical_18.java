class Car{
    private String name;
    private int topSpeed;
    public Car(String n,int ts){
        name = n;
        topSpeed = ts;
    }
    public String toString() {
        return
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed;
    }
}
public class Pratical_18 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 180);
        Car c2 = new Car("Honda", 200);
        Car c3 = new Car("Ford", 220);
        Car c4 = new Car("BMW", 250);
        Car c5 = new Car("Mercedes", 240);
        System.out.println("Car 1: " + c1);
        System.out.println("Car 2: " + c2);
        System.out.println("Car 3: " + c3);
        System.out.println("Car 4: " + c4);
        System.out.println("Car 5: " + c5);
    }
}
