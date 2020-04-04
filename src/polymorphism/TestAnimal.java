package polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}
