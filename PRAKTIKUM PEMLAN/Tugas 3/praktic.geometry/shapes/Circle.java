package praktic.geometry.shapes;

// Import class Main untuk warna dan method printGaris
import praktic.geometry.mains.Main;

public class Circle{
    // Data Field
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    // No arg constructor
    public Circle() {}

    // ID Setter
    public void setId(int id){
        this.id = id;
    }

    // Radius setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    // return nilai keliling dari radius input
    public double getKeliling(){
        return (double) pembilang/penyebut*radius*2;
    }

    // return nilai luas dari radius input pengguna
    public double getLuas() {
        return (double) pembilang/penyebut*radius*radius;    
    }

    // Print deskripsi dari object Circle: ID, Radius, Keliling, Luas
    public void printDeskripsi() {
        Main.printGaris();
        System.out.println(Main.WHITE + "ID       : " + id);
        System.out.println(Main.YELLOW + "Radius   : " + radius);
        System.out.println(Main.GREEN + "Keliling : " + getKeliling());
        System.out.println(Main.BLUE + "Luas     : " + getLuas());
        Main.printGaris();
    }
    
}
