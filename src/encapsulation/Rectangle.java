package encapsulation;

public class Rectangle {
    double weigh;
    double height;
    double area;

    public Rectangle() {
    }

    public Rectangle(double weigh, double height) {
        this.weigh = weigh;
        this.height = height;
    }

    public double getArea() {
        return weigh*height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
