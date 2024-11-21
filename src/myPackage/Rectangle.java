package myPackage;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(){
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimetr() {
        return 2 * (width+lenght);
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
