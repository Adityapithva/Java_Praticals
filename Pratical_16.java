class Animals {
    public void eats() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animals {
    public void barks() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animals {
    public void meows() {
        System.out.println("Cat is meowing");
    }
}
public class Pratical_16 {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj1.eats();
        obj1.barks();
        obj2.eats(); 
        obj2.meows();
    }
}
