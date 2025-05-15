public class Marketplace {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Buat produknya
        Product<String> produk1 = new Product<>(1, "Nama1", "Kategori1", 1);
        Product<String> produk2 = new Product<>(2, "Nama2", "Kategori1", 1);
        Product<String> produk3 = new Product<>(3, "Nama3", "Kategori2", 1);
        Product<String> produk4 = new Product<>(4, "Nama4", "Kategori2", 1);
        // Bisa pake tipe lain juga
        Product<Double> produk5 = new Product<>(5, "Nama4", 2.1, 1);
        Product<Integer> produk6 = new Product<>(6, "Nama4", 2, 1);

        // Print semua produk, isinya kosong
        manager.printProduct();

        // Tambah produk ke list
        manager.addProduct(produk1);
        manager.addProduct(produk2);
        manager.addProduct(produk3);
        manager.addProduct(produk4);

        // Print, keluar semuanya
        manager.printProduct();

        // print semua kategori, hanya ada 2 kategori1, dan kategori2
        manager.printCategory();

        // Hilangkan produk dengan ID 2 (produk2)
        manager.deleteProduct(2);

        // print semua produk, sekarang produk2 hilang
        manager.printProduct();

        // Print produk dengan ID 1 dan Nama1 (produk1)
        manager.findProduct(1, "Nama1");

        // Tambahkan produk4 dan produk3 ke queue, jadi hilang dari list produk
        manager.addQueue(produk4);
        manager.addQueue(produk3);

        // Tunjukkan semua produk, sekarang hanya sisa produk1
        manager.printProduct();

        // Tunjukkan semua item yang ada di queue, produk3 dan produk4
        manager.printQueue();
    }
}
