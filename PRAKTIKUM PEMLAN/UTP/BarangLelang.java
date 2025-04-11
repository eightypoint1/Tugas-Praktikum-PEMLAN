public class BarangLelang {
    private String namaBarang;
    private double hargaAwal;
    private double penawaranTertinggi;
    private Peserta pemenang;
    private boolean statusLelang;

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.penawaranTertinggi = hargaAwal;
        this.pemenang = null;
        this.statusLelang = false;
    }

    public String buatHarga(double angka) {
        long angkaInt = (long) angka;
        String strAngka = String.valueOf(angkaInt);
        
        if (strAngka.length() == 7) {
            return "Rp" + strAngka.charAt(0) + "." + 
                   strAngka.substring(1, 4) + "." + 
                   strAngka.substring(4);
        } 
        else if (strAngka.length() == 8) {
            return "Rp" + strAngka.substring(0, 2) + "." + 
                   strAngka.substring(2, 5) + "." + 
                   strAngka.substring(5);
        } else {
            return strAngka;
        }
    }

    public void mulaiLelang() {
        this.statusLelang = true;
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai dengan harga awal " + 
                           buatHarga(hargaAwal));
    }

    public void terimaPenawaran(Peserta peserta, double jumlah) {
        if (statusLelang != true) {
            System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
            return;
        }
        if (jumlah <= penawaranTertinggi) {
            System.out.println("Penawaran tidak valid! penawaran harus lebih tinggi dari " + 
                              buatHarga(penawaranTertinggi));
            return;
        }
        if (peserta.getSaldo() < jumlah) {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.getNama() + " tidak mencukupi");
            return;
        }
        this.penawaranTertinggi = jumlah;
        this.pemenang = peserta;
        System.out.println("Penawaran disetujui!");
    }
    
    public void tutupLelang() {
        if (statusLelang != true) {
             System.out.println("Lelang untuk " + namaBarang + " memang sudah ditutup sebelumnya.");
             return;
        }
        this.statusLelang = false;
        System.out.println("Lelang ditutup!");
        if (pemenang != null) {
            System.out.println(namaBarang + " terjual dengan harga " + 
                               buatHarga(penawaranTertinggi) + " kepada " + pemenang.getNama());
            pemenang.setSaldo(pemenang.getSaldo() - penawaranTertinggi);
            System.out.println("Sisa saldo " + pemenang.getNama() + ": " + 
                               buatHarga(pemenang.getSaldo()));
        } else {
            System.out.println("Tidak ada pemenang untuk lelang " + namaBarang + ".");
        }
    }
}