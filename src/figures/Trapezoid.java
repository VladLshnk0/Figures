package figures;

public class Trapezoid extends Figure{
    double square;
    double sideA;
    double sideB;
    double high;
    String color;
    String name = "trapezoid";

    public Trapezoid(double sideA, double sideB, double high, String color){
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
        this.square = ((sideA + sideB) / 2) * high;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getSquare() {
        return square;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getName() + ", square: " + getSquare() + ", length of high: " + getHigh() + ". color: " + getColor());
    }
}
