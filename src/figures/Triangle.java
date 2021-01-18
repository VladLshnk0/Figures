package figures;

public class Triangle extends Figure{
    double square;
    double legA;
    double legB;
    double hypotenuse;
    String color;
    String name = "triangle";

    public Triangle(double legA, double legB, String color){
        this.legA = legA;
        this.legB = legB;
        this.color = color;
        this.square = (legA * legB) / 2;
        this.hypotenuse = Math.sqrt(legA * legA + legB * legB);
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getName() + ", square: " + getSquare() + ", length of hypotenuse: " + getHypotenuse() + ", color: " + getColor());
    }
}
