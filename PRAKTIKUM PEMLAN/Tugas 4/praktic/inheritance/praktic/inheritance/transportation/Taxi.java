package praktic.inheritance.transportation;

// Kelas Taxi subclass Vehicle
public class Taxi extends Vehicle {

    // Data Field
    public static final int FARE_PER_KM = 5000; // Tarif per km 

    // Konstruktor: name, capacity, route
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route); 
    }

    // Metode untuk menghitung tarif taksi 
    @Override
    public void calculateFare(int distance) {
        int totalFare = getCurrentPassengers() * FARE_PER_KM * distance; 
        System.out.println("Total penumpang: " + getCurrentPassengers()); 
        System.out.println("Total jarak rute: " + distance + " km"); 
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }

    // // Override metode calculateFare dasar jika diperlukan
    // @Override
    // public void calculateFare() {
    //     System.out.println("Harap berikan jarak tempuh untuk menghitung tarif Taksi.");
    // }
}