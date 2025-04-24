package praktic.geometry.bases;

// Class circularShape subclass shape
public abstract class CircularShape extends Shape {
    // Field
    protected double radius;
    protected static int PI_NUMERATOR = 22;
    protected static int PI_DENOMINATOR = 7;
    public static int PI = PI_NUMERATOR/PI_DENOMINATOR;

    // No arg constructor
    public CircularShape() {}

    // Method setter radius
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Method getter radius
    public double getRadius() {
        return radius;
    }
}