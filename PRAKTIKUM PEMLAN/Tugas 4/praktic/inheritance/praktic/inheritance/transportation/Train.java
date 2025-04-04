package praktic.inheritance.transportation;

// Kelas Train subclass Vehicle
public class Train extends Vehicle {
    // Data Field
    public static final int FIXED_FARE = 10000; // Tarif tetap

    // Konstruktor: name, capacity, route
    public Train(String name, int capacity, String route) {
        super(name, capacity, route); 
    }

    // Metode override untuk menghitung tarif kereta
    @Override
    public void calculateFare() {
        int totalFare = getCurrentPassengers() * FIXED_FARE; 
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE); 
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare); 
    }
}