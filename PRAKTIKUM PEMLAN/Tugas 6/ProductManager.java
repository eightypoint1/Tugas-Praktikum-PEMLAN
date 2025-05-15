// Import untuk semua collection yang diperlukan
import java.util.*;

public class ProductManager <T extends Comparable<T>>{
    // Data
    private List<Product<?>> products;
    private Set<String> categories;
    private Queue<Product<?>> processedQueue;

    // Constructor untuk semua data
    public ProductManager() {
        products = new ArrayList<>(); // Arraylist untuk produk
        categories = new HashSet<>(); // HashSet untuk kategori
        processedQueue = new LinkedList<>(); // LinkedList buat antrian produk
    }

    // Menambahkan produk ke List products
    public void addProduct(Product<T> product) {
        products.add(product);
        // Harus ada toString karena add ngak nerima T
        categories.add(product.getCategory().toString());
    }

    // Menghilangkan produk dari List products, dengan menggunakan komparasi ID
    public void deleteProduct(int ID) {
        // Pake cara ini dapet error jadi pake builtin method 
        // for (Product<?> product : products) {
        //     if (product.getID() == ID) {
        //         products.remove(product);
        //     }
        // }
        products.removeIf(product -> product.getID() == ID);
    }

    // Fungsi mencari produk memakai id dan nama dari produk
    public void findProduct(int ID, String name) {
        for (Product<?> product : products) {
            if (product.getID() == ID && product.getName() == name) {
                System.out.println(product);
            }
        }
    }

    // Display semua produk yang ada di List products
    public void printProduct() {
        // langsung sortir aja arraylist yang udah ada
        Collections.sort(products);
        // Output semua product yang ada di 
        for (Product<?> product : products) {
            System.out.println(product); // Sekarang outputnya keluar sesuai format toString
        }
    }

    // Display Semua kategori unik
    public void printCategory() {
        for (String category : categories) {
            System.out.println(category); 
        }
    }

    // Nambah Produk ke queue
    public void addQueue(Product<?> product){
            processedQueue.add(product);
            // Harus remove product dari list product
            deleteProduct(product.getID());
    }

    // Display produk yang ada di queue
    public void printQueue(){
        for (Product<?> product : processedQueue) {
            System.out.println(product);
        }
    }
}
