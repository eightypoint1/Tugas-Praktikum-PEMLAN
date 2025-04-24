package praktic.geometry.shapes;

// Import yang diperlukan
import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

// Class Circle subclass CircularShape dan implement TwoDimensional
public class Circle extends CircularShape implements TwoDimensional {

    // nor arg constructor set nama
    public Circle() {
        setName("Circle");
    }

    // constructor dengan parameter
    public Circle(double radius) {
        this(); // isi nama
        setRadius(radius);
    }

    // Override method getArea
    @Override
    public double getArea() {
        return (double) PI * radius * radius;
    }

    // Override method getPerimeter
    @Override
    public double getPerimeter() {
        return 2.0 * (double) PI * radius;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        System.out.println("==========================================");
        System.out.println("Name              : " + getName());
        System.out.printf("Area              : %.2f\n", getArea());
        System.out.printf("Perimeter         : %.2f\n", getPerimeter());
        System.out.println("==========================================");
    }
}