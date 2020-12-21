package abstraction;

public class Dog extends Animal implements Eating {
    @Override
    public String sounding() {
        return "gau gau";
    }

    @Override
    public String howToEat() {
        return "eat meat";
    }
}
