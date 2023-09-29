package karpov.prak4;

public class Square extends Rectangle {
    public Square(String colour, boolean filled, double width, double height) {
        super(colour, filled, width, height);
    }
    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public double getArea() {
        return Math.pow(this.getWidth(),2);
    }

    @Override
    public double getPerimeter() {
        return 4*this.getWidth();
    }

    @Override
    public String toString() {
        return "square{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
