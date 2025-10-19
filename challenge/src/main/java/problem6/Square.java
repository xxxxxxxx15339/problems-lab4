package problem6;

public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    public double getSurface() {
        return side * side;
    }

    public String getDescription() {
        return String.format("Square (side %.1f cm)", side);
    }

    public String toString() {
        return getDescription();
    }
}
