package figures;

public class Circle extends Figure{
    double square;
    double radius;
    String color;
    String name = "circle";

    public Circle(double radius, String color){
        this.radius = radius;
        this.square = Math.PI * (radius * radius);
        this.color = color;
    }

    @Override
    public double getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getName() + ", square: " + getSquare() + ", radius: " + getRadius() + ", color: " + getColor());
    }
}
