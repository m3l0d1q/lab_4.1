package karpov.prak4;

public class Circle extends Shape {
    private double radius;

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* Math.pow(this.radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}
