package praktic.geometry.shapes;

import praktic.geometry.mains.Main;

public class Circle{
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    public Circle() {}

    public void setId(int id){
        this.id = id;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getKeliling(){
        return 2*(Math.PI)*radius;
    }

    public double getLuas() {
        return radius*radius*(Math.PI);    
    }

    public void printDeskripsi() {
        Main.printGaris();
        System.out.println(Main.WHITE + "ID       : " + id);
        System.out.println(Main.YELLOW + "Radius   : " + radius);
        System.out.println(Main.GREEN + "Keliling : " + getKeliling());
        System.out.println(Main.BLUE + "Luas     : " + getLuas());
        Main.printGaris();
    }
    
}
