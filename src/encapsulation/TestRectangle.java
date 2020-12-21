package encapsulation;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWeigh(5);
        System.out.println(rectangle.height);
        System.out.println(rectangle.weigh);
        System.out.println(rectangle.getArea());
    }
}
