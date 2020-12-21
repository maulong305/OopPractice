package abstraction;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Bird bird = new Bird();

        System.out.println("dog: " + dog.howToEat());
        System.out.println(dog.sounding());
        System.out.println((bird.sounding()));
    }
}
