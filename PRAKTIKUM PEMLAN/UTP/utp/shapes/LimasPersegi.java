package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    @Override
    public double getLuasPermukaan() {
        double La = sisi * sisi;
        double Ts = Math.sqrt(Math.pow(getTinggi(), 2) + Math.pow(sisi / 2.0, 2));
        double Ls = Ts * sisi / 2.0;
        return 4.0 * Ls + La;
    }

    @Override
    public double getVolume() {
        double La = sisi * sisi;
        return La * getTinggi() / 3.0;
    }
}