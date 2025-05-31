package uap.bases;

// Dibuat abstract class di sini, asumsinya supaya diextend di kelas Torus dan Sphere
public abstract class Shape {

    // Data
    private String name;

    // Constructor no arg
    public Shape() {};

    // setter variabel name
    public void setName(String inputName) {
        this.name = inputName;
    }

    // getter variabel name
    public String getName() {
        return name;
    }

    // abstract method, implementasinya di Kelas Torus dan Sphere
    public abstract void printInfo();
}
