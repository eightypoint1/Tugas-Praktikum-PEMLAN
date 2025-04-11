package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private static final int PEMBILANG = 22;
    private static final int PENYEBUT = 7;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        setTinggi(tinggi);
        setNama("Tabung");
    }

    public Tabung() {
         setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
         this.radius = inputRadius;
    }

    @Override
    public double getLuasPermukaan() {
        double La = ((double)PEMBILANG / PENYEBUT) * Math.pow(radius, 2);
        double K = 2.0 * ((double)PEMBILANG / PENYEBUT) * radius;
        return 2.0 * La + K * getTinggi();
    }

    @Override
    public double getVolume() {
        double La = ((double)PEMBILANG / PENYEBUT) * Math.pow(radius, 2);
        return La * getTinggi();
    }
}