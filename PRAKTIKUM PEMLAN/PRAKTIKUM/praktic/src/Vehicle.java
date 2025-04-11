package praktic.inheritance.transportation;

/**
 * Kelas abstrak dasar yang merepresentasikan sebuah kendaraan dalam sistem transportasi.
 * Menyimpan informasi dasar seperti nama, kapasitas, rute, dan jumlah penumpang saat ini.
 * Menyediakan metode dasar untuk operasi kendaraan.
 */
public abstract class Vehicle {
    // --- Atribut ---
    protected String nama; // Nama kendaraan (contoh: "Bus", "Kereta")
    protected int kapasitas; // Kapasitas maksimum penumpang
    protected String rute; // Rute perjalanan kendaraan
    protected int jumlahPenumpangSaatIni; // Jumlah penumpang di dalam kendaraan saat ini

    // --- Konstruktor ---
    /**
     * Konstruktor untuk membuat objek Vehicle baru.
     * Menginisialisasi nama, kapasitas, dan rute. Jumlah penumpang awal diatur ke 0.
     * [cite: 18, 19]
     * @param nama Nama kendaraan.
     * @param kapasitas Kapasitas maksimum penumpang.
     * @param rute Rute perjalanan.
     */
    public Vehicle(String nama, int kapasitas, String rute) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.rute = rute;
        this.jumlahPenumpangSaatIni = 0; // Penumpang awal adalah 0 [cite: 19]
    }

    // --- Metode Operasi Dasar ---
    /**
     * Menaikkan sejumlah penumpang ke dalam kendaraan.
     * Memeriksa apakah penambahan penumpang melebihi kapasitas maksimum.
     * [cite: 8]
     * @param jumlah Jumlah penumpang yang naik.
     */
    public void naikkanPenumpang(int jumlah) {
        if (jumlahPenumpangSaatIni + jumlah <= kapasitas) {
            jumlahPenumpangSaatIni += jumlah;
            System.out.println(jumlah + " penumpang naik ke dalam " + nama);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + jumlah + " penumpang"); // Pesan jika kapasitas penuh [cite: 24, 25, 26]
        }
    }

    /**
     * Menurunkan sejumlah penumpang dari kendaraan.
     * Memeriksa apakah jumlah penumpang cukup untuk diturunkan.
     * [cite: 9]
     * @param jumlah Jumlah penumpang yang turun.
     */
    public void turunkanPenumpang(int jumlah) {
        if (jumlahPenumpangSaatIni >= jumlah) {
            jumlahPenumpangSaatIni -= jumlah;
            System.out.println(jumlah + " penumpang turun dari " + nama);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun"); // Pesan jika penumpang tidak cukup [cite: 23, 24, 25, 26]
        }
    }

    /**
     * Memulai perjalanan kendaraan pada rutenya.
     * [cite: 7]
     */
    public void mulaiPerjalanan() {
        System.out.println(nama + " memulai perjalanan di " + rute);
    }

    /**
     * Menghentikan perjalanan kendaraan setelah mencapai tujuan.
     * [cite: 8]
     */
    public void hentikanPerjalanan() {
        System.out.println(nama + " mencapai tujuan akhir dan berhenti");
    }

    // --- Metode Getter ---
    /**
     * Mengembalikan jumlah penumpang saat ini di dalam kendaraan.
     * [cite: 18]
     * @return Jumlah penumpang saat ini.
     */
    public int dapatkanJumlahPenumpangSaatIni() {
        return jumlahPenumpangSaatIni;
    }

    // --- Metode Abstrak ---
    /**
     * Metode abstrak untuk menghitung tarif perjalanan.
     * Harus diimplementasikan oleh setiap subclass kendaraan.
     * [cite: 18]
     * @return Total tarif perjalanan.
     */
    public abstract long hitungTarif(); // Metode ini akan berbeda untuk Bus, Kereta, Taksi

    /**
     * Metode abstrak overload untuk kasus tarif yang memerlukan parameter tambahan
     * seperti jumlah halte atau jarak.
     * @param detail Parameter spesifik (halte untuk bus, jarak untuk taksi).
     * @return Total tarif perjalanan.
     */
     public abstract long hitungTarif(int detail); // Overload untuk Bus dan Taksi

}