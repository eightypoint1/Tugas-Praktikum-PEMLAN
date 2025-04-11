package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas;
    private double kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }

    @Override
    public double getLuasPermukaan() {
        double Ta = Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas / 2.0, 2));
        double La = Ta * alas / 2.0;
        double K = 2.0 * kaki + alas;
        return 2.0 * La + K * getTinggi();
    }

    @Override
    public double getVolume() {
        double Ta = Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas / 2.0, 2));
        double La = Ta * alas / 2.0;
        return La * getTinggi();
    }
}