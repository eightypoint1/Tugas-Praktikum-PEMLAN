package praktic.geometry.shapes;

// Import yang diperlukan 
import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Class Sphere cubclass CircularShape implement ThreeDimensional dan Weightable (untuk menghitung volume)
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    // Field
    private double mass;

    // Constructor no arg isi nama
    public Sphere() {
        setName("Sphere");
    }

    // Constructor dengan parameter
    public Sphere(double radius, double mass) {
        this(); // isi nama
        setRadius(radius);
        this.mass = mass;
    }

    // Override getSurfaceArea
    @Override
    public double getSurfaceArea() {
        return 4.0 * (double) PI * radius * radius;
    }

    // Override getVolume
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * (double) PI * radius * radius * radius;
    }

    // Override getWeight
    @Override
    public double getWeight() {
        return mass * g;
    }

    // override printinfo
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