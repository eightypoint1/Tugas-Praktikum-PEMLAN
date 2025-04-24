package praktic.geometry.shapes;

// Import yang diperlukan
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Class Cube subclass Shape, implement ThreeDimensional, dan Weightable (buat menghitung volume)
public class Cube extends Shape implements ThreeDimensional, Weightable {
    // Field
    private double edge;
    private double mass;

    // Constructor no arg, isi nama
    public Cube() {
        setName("Cube");
    }

    // Constructor parameter
    public Cube(double edge, double mass) {
        this(); // isi nama
        this.edge = edge;
        this.mass = mass;
    }

    // Overide getSurfaceArea
    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // Override getVolume
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    // Overide getWeight
    @Override
    public double getWeight() {
        return mass * g;
    }

    // Override printinfo
    @Override
    public void printInfo() {
        System.out.println("==========================================");
        System.out.println("Name              : " + getName());
        System.out.printf("Surface area      : %.2f\n", getSurfaceArea());
        System.out.printf("Volume            : %.2f\n", getVolume());
        System.out.printf("Weight            : %.2f\n", getWeight());
        System.out.println("==========================================");
    }
}