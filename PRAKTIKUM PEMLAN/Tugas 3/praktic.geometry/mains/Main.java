package praktic.geometry.mains;

// Import Class Circle untuk mendeklarasi Objek Circle
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;

// Import Scanner untuk input pengguna
import java.util.Scanner;

public class Main{

    // String Kode ANSI untuk memberi warna pada output, static agar dapat digunakan tanpa instansiasi class
    public static String WHITE = "\u001B[0m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE = "\u001B[94m";

    // Method untuk print Garis, static agar dapat digunakan tanpai instansiasi class
    public static void printGaris(){
        System.out.println(WHITE + "====================");
    }
    public static void main(String[] args) {
        // Instansiasi objek lingkaran
        Circle lingkaran = new Circle();

        //Instansiasi objek Rectangle
        Rectangle rectangle = new Rectangle();

        // Instansiasi Objek scanner
        Scanner scan = new Scanner(System.in);

        // Print Informasi Mahasiswa
        printGaris();
        System.out.println("Nama : Ezekiel Aaron Marmora");
        System.out.println("NIM  : 245150701111017");
        printGaris();

        System.out.println("Circle");
        printGaris();

        // Input ID objek lingkaran
        System.out.print("Isikan ID : "); 
        lingkaran.setId(scan.nextInt());

        // Input Radius objek lingkaran
        System.out.print("Isikan Radius : ");
        lingkaran.setRadius(scan.nextDouble());

        // Output Deskripsi objek lingkaran
        lingkaran.printDeskripsi();

        System.out.println("Rectangle");
        printGaris();

        // Input ID objek lingkaran
        System.out.print("Isikan ID : "); 
        rectangle.setId(scan.nextInt());
        
        // Input Radius objek lingkaran
        System.out.print("Isikan Panjang : ");
        rectangle.setPanjang(scan.nextDouble());

        // Input Radius objek lingkaran
        System.out.print("Isikan Lebar: ");
        rectangle.setLebar(scan.nextDouble());

        rectangle.printDeskripsi();
    }
}