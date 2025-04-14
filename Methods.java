abstract class Animal {
    public abstract void makeSound();
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class Methods {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("Cat says: ");
        cat.makeSound();
        System.out.println("Dog says: ");
        dog.makeSound();
    }
}
