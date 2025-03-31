public class veeKasutaja extends koduMasin{
    private double veeKasutus;

    public veeKasutaja(String energiaEffektiivsus, String nimi, String brand, double kwH, double veeKasutus) {
        super(energiaEffektiivsus, nimi, brand, kwH);
        this.veeKasutus = veeKasutus;
    }

    public double getVeeKasutus() {
        return veeKasutus;
    }

    public void setVeeKasutus(double veeKasutus) {
        this.veeKasutus = veeKasutus;
    }
}
