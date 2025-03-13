package praktic.geometry.shapes;

// Import class Main untuk warna dan method printGaris
import praktic.geometry.mains.Main;

public class Rectangle {
    // Data Field
    private int id;
    private double panjang;
    private double lebar;

    // Constructor: id, panjang, lebar
    public Rectangle(int id, double panjang, double lebar){
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // no arg constructor
    public Rectangle() {}

    // method getter: id
    public int getId(){
        return id;
    }

    // method getter: Panjang
    public double getPanjang(){
        return panjang;
    }

    // method getter: Lebar
    public double getLebar(){
        return lebar;
    }

    // method getter: Keliling dari input lebar dan panjang
    public double getKeliling(){
        return (double) (2*lebar)+(2*panjang);
    }

    // method getter: Keliling dari input lebar dan panjang
    public double getLuas(){
        return (double) lebar*panjang;
    }

    // ID Setter
    public void setId(int id){
        this.id = id;
    }

    // Panjang Setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    // Panjang Setter
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    // Print deskripsi dari object Circle: ID, Radius, Keliling, Luas
    public void printDeskripsi() {
        Main.printGaris();
        System.out.println(Main.GREEN + "ID       : " + getId());
        System.out.println(Main.YELLOW + "Panjang   : " + getPanjang());
        System.out.println(Main.BLUE + "Lebar   : " + getLebar());
        System.out.println(Main.GREEN + "Keliling : " + getKeliling());
        System.out.println(Main.BLUE + "Luas     : " + getLuas());
        Main.printGaris();
     }
}
