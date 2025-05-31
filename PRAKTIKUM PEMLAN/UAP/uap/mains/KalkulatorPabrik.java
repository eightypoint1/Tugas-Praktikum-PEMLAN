package uap.mains;

// Import semua bentuknya
import uap.models.*;
//Import buat scanner
import java.util.*;

public class KalkulatorPabrik {

    // Method buat ngeformat harga jadi rupiah
    // Ini kurang lebih sama dengan method yang saya gunakan untuk UTP
    // https://github.com/eightypoint1/Tugas-Praktikum-PEMLAN/blob/main/PRAKTIKUM%20PEMLAN/UTP/utp/lelang/Peserta.java
    public static String buatHarga(double angka) {
        long angkaInt = (long) angka;
        String strAngka = String.valueOf(angkaInt);
        
        if (strAngka.length() == 4) {
            return "Rp" + strAngka.charAt(0) + "." + 
                   strAngka.substring(1, 4);
        } 
        else if (strAngka.length() == 5) {
            return "Rp" + strAngka.substring(0, 2) + "." + 
                   strAngka.substring(2, 5);
        } else {
            return strAngka;
        }
    }

    public static void main(String[] args) {
        // Buat Scanner 
        Scanner scan = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Ezekiel Aaron Marmora");
        System.out.println("245150701111017");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        // Input untuk kedua nilai Torus
        System.out.print("Isikan Radius   : ");
        double torusMajorRadius = scan.nextDouble();
        System.out.print("Isikan radius   : ");
        double torusMinorRadius = scan.nextDouble();
        System.out.println("=============================================");

        // Buat objek Torus dari Input
        Torus torus = new Torus(torusMajorRadius, torusMinorRadius);
        torus.setName("Torus Donut");
        // output informasi
        torus.printInfo();
        System.out.println("Massa dalam kg  : " + torus.gramToKilogram());
        System.out.println("Biaya kirim     : " + buatHarga(torus.calculateCost()));
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        // Input untuk sphere
        System.out.print("Isikan radius   : ");
        double sphereRadius = scan.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(sphereRadius);
        sphere.setName("Sphere Donut");
        sphere.printInfo();
        System.out.println("Massa dalam kg  : " + sphere.gramToKilogram());
        System.out.println("Biaya kirim     : " + buatHarga(sphere.calculateCost()));
        System.out.println("=============================================");
    }
}