package myPackage;

public class Square extends Rectangle {
    protected double side;

    Square(){
    }

    public Square (double side) {
        this.width=side;
        this.lenght = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.lenght = side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side){
        this.width = side;
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
