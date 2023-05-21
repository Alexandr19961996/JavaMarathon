package day9.Task2;

import day9.Task1.Teacher;

public class Triangle extends Figure {

    private double lengthFirstSide;
    private double lengthSecondSide;
    private double lengthThirdSide;

    public Triangle(double lengthFirstSide, double lengthSecondSide, double lengthThirdSide, String color) {
        super(color);
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - lengthFirstSide) * (perimeter() / 2 - lengthSecondSide) * (perimeter() / 2 - lengthThirdSide));
    }

    @Override
    public double perimeter() {
        return lengthFirstSide + lengthSecondSide + lengthThirdSide;
    }
}
