package praktic.geometry.bases;

// Deklarasi class Shape, abstract sesuai ketentuan
public abstract class Shape {
    // Variabel name untuk semua bentuk
    protected String name;

    // No arg constructor
    public Shape() {}

    // Method setter nilai untuk nama
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Method Getter untuk nama
    public String getName() {
        return name;
    }

    // method abstract untuk printinfo semua bentuk
    public abstract void printInfo();
}