// Class Product, extend hanya subclass Comparable
// Implements Comparable Product<T> supaya bisa pake compareTo buat mengurutkan berdasarkan kategori
public class Product<T extends Comparable<T>> implements Comparable<Product<T>>{
    // Data
    private int ID;
    private String name;
    private T category; // Yang Jenis Generic
    private double price;

    // COnstructor untuk semua argumen di data fieldnya
    public Product(int ID, String name, T category, double price) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter yang diperlukan supaya bisa dipake buat method compareTo
    public T getCategory() {
        return category;
    }

    // Fungsi Getter buat implementasi fungsi delete berdasarkan ID dan mencari berdasarkan ID dan nama di kelas ProductManager
    public int getID() {
        return ID;
    }

    // FUngsi getter untuk mencari berdasarkan ID dan nama di kelas ProductManager
    public String getName() {
        return name;
    }

    // Method compareTo untuk mengurutkan berdasarkan kategori
    // Ini rupanya diperlukan supaya kita bisa pake sort di kelas ProductManagers
    @Override
    public int compareTo(Product<T> product){
        return this.category.compareTo(product.getCategory());
    }

    // Override method toString
    @Override
    public String toString(){
        return "ID: " + ID + " Name: " + name + " Category: " + category + " Price: " + price;
    }
}
