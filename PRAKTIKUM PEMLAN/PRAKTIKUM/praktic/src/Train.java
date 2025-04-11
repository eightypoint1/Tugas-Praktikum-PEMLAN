package praktic.inheritance.transportation;

/**
 * Kelas yang merepresentasikan kendaraan jenis Kereta.
 * Mewarisi dari kelas Vehicle dan mengimplementasikan perhitungan tarif tetap per penumpang.
 * [cite: 11, 18]
 */
public class Train extends Vehicle {
    // Konstanta tarif tetap per penumpang untuk Kereta (static final) [cite: 18]
    private static final int TARIF_TETAP = 10000; // Tarif tetap per penumpang [cite: 11]

    /**
     * Konstruktor untuk membuat objek Train baru.
     * [cite: 18]
     * @param nama Nama kereta (contoh: "Kereta Commuter Line").
     * @param kapasitas Kapasitas maksimum penumpang (contoh: 200)[cite: 14].
     * @param rute Rute perjalanan (contoh: "Stasiun Kota - Stasiun Pusat")[cite: 14].
     */
    public Train(String nama, int kapasitas, String rute) {
        super(nama, kapasitas, rute);
    }

    /**
     * Menghitung total tarif perjalanan Kereta berdasarkan tarif tetap per penumpang.
     * Tarif dihitung sebagai (jumlah penumpang * tarif tetap).
     * [cite: 11]
     * @return Total tarif perjalanan kereta.
     */
    @Override
    public long hitungTarif() {
        System.out.println("Total penumpang: " + this.jumlahPenumpangSaatIni);
        System.out.println("Tarif tetap per penumpang: Rp " + TARIF_TETAP);
        long totalTarif = (long) this.jumlahPenumpangSaatIni * TARIF_TETAP;
        return totalTarif;
    }

     /**
     * Menghitung total tarif perjalanan Kereta.
     * Metode ini memanggil hitungTarif() karena tarif kereta tidak bergantung pada detail tambahan.
     * @param detail Parameter ini diabaikan untuk Kereta.
     * @return Total tarif perjalanan kereta.
     */
    @Override
    public long hitungTarif(int detail) {
        // Tarif kereta tidak bergantung pada detail seperti halte atau jarak,
        // jadi kita panggil saja metode hitungTarif() tanpa parameter.
        return hitungTarif();
    }
}