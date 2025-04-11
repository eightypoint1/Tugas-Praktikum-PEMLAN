package utp.mains;

import java.util.*;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;



/* Ezekiel Aaron Marmora - 245150701111017

 _____         _    _      _ 
| ____|_______| | _(_) ___| |
|  _| |_  / _ \ |/ / |/ _ \ |
| |___ / /  __/   <| |  __/ |
|_____/___\___|_|\_\_|\___|_|
                                                     

*/

public class Main {

    public static final String biru = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(biru + "===================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("Ezekiel Aaron Marmora");
        System.out.println("245150701111017");
        System.out.println("===================================");

        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("===================================");
        System.out.print("Isikan alas     : ");
        double alasPrisma = scanner.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kakiPrisma = scanner.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = scanner.nextDouble();

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alasPrisma, kakiPrisma, tinggiPrisma);
        System.out.println("===================================");
        prisma.printInfo();
        System.out.println("===================================");

        System.out.println("Limas Persegi");
        System.out.println("===================================");
        System.out.print("Isikan sisi     : ");
        double sisiLimas = scanner.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = scanner.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisiLimas, tinggiLimas);
        System.out.println("===================================");
        limas.printInfo();
        System.out.println("===================================");

        System.out.println("Tabung");
        System.out.println("===================================");
        System.out.print("Isikan radius   : ");
        double radiusTabung = scanner.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = scanner.nextDouble();

        Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
        System.out.println("===================================");
        tabung.printInfo();
        System.out.println("===================================");

        scanner.close();
    }
}