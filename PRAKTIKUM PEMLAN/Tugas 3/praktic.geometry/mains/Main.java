package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;
import java.util.Scanner;

public class Main{

    public static String WHITE = "\u001B[0m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE = "\u001B[94m";

    public static void printGaris(){
        System.out.println(WHITE + "====================");
    }
    public static void main(String[] args) {
        Circle lingkaran = new Circle();
        Scanner scan = new Scanner(System.in);
        printGaris();
        System.out.println("Nama : Ezekiel Aaron Marmora");
        System.out.println("NIM  : 245150701111017");
        printGaris();
        System.out.println("Circle");
        printGaris();
        System.out.print("Isikan ID : "); 
        lingkaran.setId(scan.nextInt());
        System.out.print("Isikan Radius : ");
        lingkaran.setRadius(scan.nextDouble());

        lingkaran.printDeskripsi();
    }
}