package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter {
    
    // Field
    private double radius;

    // no arg constructor
    public Sphere() {}

    // Konstruktor arg radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // getter radius
    public double getRadius() {
        return radius;
    }

    // setter radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // implementasikan dari ThreeDimensional
    public double getVolume() {
        return (4.0 / 3.0) * PI * this.radius * this.radius * this.radius;
    }

    // implementasikan dari ThreeDimensional
    public double getSurfaceArea() {
        return 4 * PI * this.radius * this.radius;
    }

    // import dari masscalculable
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // import dari massconverter
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // implement shippingcostCalculator
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