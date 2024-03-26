class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class Labrador extends Dog{
    public void display(){
        System.out.println("Labrador is a type of dog");
    }
}
public class Pratical_15 {
    public static void main(String[] args) {
        Labrador obj = new Labrador();
        obj.eat();
        obj.bark();
        obj.display();
    }
}
