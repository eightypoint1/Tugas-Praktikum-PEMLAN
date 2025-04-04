package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Train;
import praktic.inheritance.transportation.Taxi;

// kelas Main
public class Main {

    public static void main(String[] args) {

        // Membuat objek bus1
        Bus bus1 = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B"); 
        bus1.startJourney(); 

        // Naikan penumpang
        bus1.boardPassengers(30);
        bus1.boardPassengers(20);

        // Hitung tarif objek bus1
        bus1.calculateFare(5);

        // Berhentikan Perjalanan
        bus1.stopJourney();
        bus1.dropPassengers(bus1.getCurrentPassengers());
        System.out.println();

        // Membuat objek train1
        Train train1 = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat"); 
        train1.startJourney();

        // Naikan penumpang
        train1.boardPassengers(150);

        // Hitung tarif objek train1
        train1.calculateFare();

        // Berhentikan Perjalanan
        train1.stopJourney();
        train1.dropPassengers(train1.getCurrentPassengers());
        System.out.println();

        // Membuat objek taxi1
        Taxi taxi1 = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel"); 
        taxi1.startJourney(); 

        // Naikan penumpang
        taxi1.boardPassengers(3); 

        // Hitung tarif objek taxi1
        taxi1.calculateFare(10);

        // Berhentikan Perjalanan
        taxi1.stopJourney(); 
        taxi1.dropPassengers(taxi1.getCurrentPassengers());
        System.out.println();
        System.out.println();


         // Membuat objek bus2
         Bus bus2 = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");
         bus2.startJourney();
         bus2.boardPassengers(30); 

         // Melebihi Kapasitas
         bus2.boardPassengers(100); 
         bus2.calculateFare(5); 
         bus2.stopJourney();
         bus2.dropPassengers(30); 

         // Kurang Kapasitas
         bus2.dropPassengers(1); 
         System.out.println();

         // Membuat objek train2
         Train train2 = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
         train2.startJourney();
         train2.boardPassengers(150);

         // Melebihi Kapasitas
         train2.boardPassengers(300); 
         train2.calculateFare();
         train2.stopJourney();
         train2.dropPassengers(150);

         // Kurang Kapasitas
         train2.dropPassengers(1);
         System.out.println();

         // Membuat objek taxi2
         Taxi taxi2 = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel");
         taxi2.boardPassengers(3); 

         // Melebihi Kapasitas
         taxi2.boardPassengers(10);
         taxi2.calculateFare(10); 
         taxi2.stopJourney();
         taxi2.dropPassengers(3);

         // Kurang Kapasitas
         taxi2.dropPassengers(1); 
         System.out.println();
    }
}