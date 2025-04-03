public class Veekasutaja extends Kodumasin {
    private double veemahutavus;

    public Veekasutaja(String nimi, String brand, String energiaEfektiivsus, double kwH, double veemahutavus) {
        super(nimi, brand, energiaEfektiivsus, kwH);
        this.veemahutavus = veemahutavus;
    }

    public double getVeeKasutus() {
        return veemahutavus;
    }

    public void setVeeKasutus(double veeKasutus) {
        this.veemahutavus = veemahutavus;
    }

    @Override
    public String toString() {
        return super.toString() + ", veemahutavus on " + veemahutavus + " liitrit";
    }
}
