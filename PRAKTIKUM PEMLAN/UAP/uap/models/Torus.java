package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

// Mengextend kelas Shape, sesuai ketentuan
// Implement PiRequired untuk semua kebutuhan menghitung
// Implement sisanya buat 
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter {

    // Field
    private double majorRadius;
    private double minorRadius;

    // konstruktor no arg
    public Torus() {
        super();
    }

    // Konstructor arg = majorRadius dan minorRadius
    public Torus(double majorRadius, double minorRadius) {
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // getter majorRadius
    public double getMajorRadius() {
        return majorRadius;
    }

    // setter majorRadius
    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    // getter minorRadius
    public double getMinorRadius() {
        return minorRadius;
    }

    // setter monirRadius
    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    // implementasikan dari ThreeDimensional
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // implementasikan dari ThreeDimensional
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // implementasikan dari MassCalculable
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // implement dari Mass Converter
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // implement dari shippingcostcalculator
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Override printInfo dari Shape
    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
    }
}
