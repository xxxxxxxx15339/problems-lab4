package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getSurface() {
        return Math.PI * radius * radius;
    }

    public String getDescription() {
        return String.format("Circle (radius %.1f cm)", radius);
    }

    public String toString() {
        return getDescription();
    }
}
