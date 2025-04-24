package praktic.geometry.shapes;

// Import yang diperlukan
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

// Class Square subclass Shape dan mengimplementasi TwoDimensional
public class Square extends Shape implements TwoDimensional {
    // data field
    private double side;

    // Constructor no arg, isi nama
    public Square() {
        setName("Square");
    }

    // Constructor dengan parameter side
    public Square(double side) {
        this(); // isi nama
        this.side = side;
    }

    // Overide method luas
    @Override
    public double getArea() {
        return side * side;
    }

    // Override method keliling
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Override printinfo
    @Override
    public void printInfo() {
        System.out.println("==========================================");
        System.out.println("Name              : " + getName());
        System.out.printf("Area              : %.2f\n", getArea());
        System.out.printf("Perimeter         : %.2f\n", getPerimeter());
        System.out.println("==========================================");
    }
}