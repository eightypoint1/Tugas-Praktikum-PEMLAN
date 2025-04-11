public class Peserta {
    private String nama;
    private double saldo;

    public Peserta(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public void tawar(BarangLelang barang, double jumlah) {
        System.out.println(this.nama + " menawar " + buatHarga(jumlah));
        barang.terimaPenawaran(this, jumlah);
    }
}