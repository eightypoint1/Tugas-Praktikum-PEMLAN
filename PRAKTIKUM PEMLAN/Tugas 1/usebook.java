public class usebook {
    public static void main(String[] args) {

        // Instansiasi Objek: Buku1
        Book Buku1 = new Book();
        // Pemberian nilai pada atribut data: Genre, Judul, Penulis
        Buku1.Genre = "Science Fiction";
        Buku1.Judul = "Dune";
        Buku1.Penulis = "Frank Herber";

        // Output atribut objek Buku1: Judul, Penulis, Genre
        Buku1.printJudul();
        Buku1.printPenulis();
        Buku1.printGenre();

        // Instansiasi Objek: Buku2
        Book Buku2 = new Book("To Kill a Mockingbird","Harper Lee","Fiction");

        // Output atribut objek Buku1: Judul, Penulis, Genre
        Buku2.printJudul();
        Buku2.printPenulis();
        Buku2.printGenre();
    }
}