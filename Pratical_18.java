class Car{
    private String name;
    private int topSpeed;
    public Car(String n,int ts){
        name = n;
        topSpeed = ts;
    }
    public String toString() {
        return  name + ' ' + topSpeed;
    }
}
public class Pratical_18 {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", 180),
            new Car("Honda", 200),
            new Car("Ford", 220),
            new Car("BMW", 250),
            new Car("Mercedes", 240)
        };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

