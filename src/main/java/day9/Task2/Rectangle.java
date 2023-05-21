package day9.Task2;

public class Rectangle extends Figure {

    private double weight;
    private double height;

    public Rectangle(double weight, double height, String color) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double area() {
        return weight * height;
    }

    @Override
    public double perimeter() {
        return 2 * (weight + height);
    }
}
