package praktic.inheritance.transportation;

// Kelas Bus subclass Vehicle
public class Bus extends Vehicle {
    // Data Field
    public static final int FARE_PER_STOP = 2000; // Tarif per halte 

    // Konstruktor: name, capacity, route
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Metode untuk menghitung tarif bus
    public void calculateFare(int stops) {
        int totalFare = getCurrentPassengers() * FARE_PER_STOP * stops; 
        System.out.println("Total penumpang: " + getCurrentPassengers()); 
        System.out.println("Total pemberhentian: " + stops); 
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }
}