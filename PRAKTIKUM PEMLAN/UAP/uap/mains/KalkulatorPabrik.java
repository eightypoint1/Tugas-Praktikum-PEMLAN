package uap.mains;

// Import semua bentuknya
import uap.models.*;
// Ini untuk bagian use kelas Shape dan use interface MassConverter dan ShippingCostCalculator
import uap.bases.Shape;
import uap.interfaces.MassConverter;
import uap.interfaces.ShippingCostCalculator;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Ezekiel Aaron Marmora");
        System.out.println("245150701111017");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double torusMajorRadius = scan.nextDouble();
        System.out.print("Isikan radius   : ");
        double torusMinorRadius = scan.nextDouble();
        System.out.println("=============================================");

        // Buat Torus
        Torus torus = new Torus(torusMajorRadius, torusMinorRadius);
        
        // Ini implementasi Polimorfisme, sedikit jelek tapi bekerja
        // Kita mengimplementasikan printinfo menggunakan Shape
        // Hitung massa menggunakan MassConverter
        // Hitung Harga menggunakan Shippingcostcalculator
        Shape shapeTorus = torus;
        MassConverter converterTorus = torus;
        ShippingCostCalculator calculatorTorus = torus;

        shapeTorus.printInfo();
        
        System.out.println("Massa dalam kg  : " + converterTorus.gramToKilogram());
        System.out.println("Biaya kirim     : " + buatHarga(calculatorTorus.calculateCost()));
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double sphereRadius = scan.nextDouble();
        System.out.println("=============================================");

        // Sama seperti untuk Torus 
        Sphere specificSphere = new Sphere(sphereRadius);

        Shape shapeSphere = specificSphere;
        MassConverter converterSphere = specificSphere;
        ShippingCostCalculator calculatorSphere = specificSphere;

        shapeSphere.printInfo();
        
        System.out.println("Massa dalam kg  : " + converterSphere.gramToKilogram());
        System.out.println("Biaya kirim     : " + buatHarga(calculatorSphere.calculateCost()));
        System.out.println("=============================================");
    }
}