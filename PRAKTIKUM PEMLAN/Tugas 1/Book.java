// Pembuatan Kelas "Book"
public class Book {
    // Data Field
    public String Judul;
    public String Penulis;
    public String Genre;

    // Metode Print Judul Buku
    public void printJudul() {
        System.out.println("Judul: " + Judul);                                                               
    }

    // Metode Print Penulis Buku
    public void printPenulis() {
        System.out.println("Penulis: " + Penulis);     
    }

    // Metode Print Genre Buku
    public void printGenre() {
        System.out.println("Genre: " + Genre);     
    }

    //Constructor parameter: Judul, Penulis, Genre
    public Book(String Judul, String Penulis, String Genre) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Genre = Genre;
    }

    // Constructor no arg
    public Book() {}
}
