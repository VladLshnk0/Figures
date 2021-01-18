package figures;

public class Square extends Figure {
    double square;
    double lengthOfSide;
    String color;
    String name = "square";

    public Square(double lengthOfSide, String color){
        this.square = lengthOfSide * lengthOfSide;
        this.lengthOfSide = lengthOfSide;
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

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getName() + ", square: " + getSquare() + ", length of side: " + getLengthOfSide() + ", color: " + getColor());
    }
}
