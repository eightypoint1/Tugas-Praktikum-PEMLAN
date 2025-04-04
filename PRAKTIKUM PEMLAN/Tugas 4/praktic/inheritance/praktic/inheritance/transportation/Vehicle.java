package praktic.inheritance.transportation;

// Kelas Vehicle
public class Vehicle {

    // Data field
    private String name;
    private int capacity;
    private String route;
    private int currentPassengers;

    // Konstruktor: name, capacity, route
    public Vehicle(String name, int capacity, String route) {
        this.name = name; 
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    // Metode Menaikkan Penumpang
    public void boardPassengers(int count) {

        // Cek jika melampaui kapastias
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam " + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang"); 
        }
    }

    // Metode Menurunkan Penumpang
    public void dropPassengers(int count) {

        // Cek jika kurang kapasitas
        if (currentPassengers >= count) {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun"); 
        }
    }

    // Metode Memulai perjalanan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // Metode Menghentikan perjalanan
    public void stopJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti"); 
    }

    // Meotde menghitung tarif yang akan di override berdasarkan kendaraan
    public void calculateFare() {
        System.out.println("Metode perhitungan tarif dasar.");
    }

    // Metode mendapatkan jumlah penumpang
    public int getCurrentPassengers() {
        return currentPassengers;
    }

}