public class koduMasin implements masin{
    private String energiaEffektiivsus;
    private double kwH;
    private String nimi;
    private String brand;
    private String seletus;

    public koduMasin(String energiaEffektiivsus, String nimi, String brand, double kwH) {
        this.energiaEffektiivsus = energiaEffektiivsus;
        this.kwH = kwH;
        this.nimi = nimi;
        this.brand = brand;
        this.seletus = null;
    }
    public void seletaMasin(){
        if(seletus == null){
            System.out.println("Pange sisse enda masina esimene informatsioon");
        }
        else {
            System.out.println("Kirjutage ümber enda masina informatsioon");
        }
    }
    public double elektriKasutus(){
        double energiaK = 0;
        switch(energiaEffektiivsus.toLowerCase()){
            case("a"):
                 energiaK = kwH * 0.5;
            case("b"):
                energiaK = kwH * 0.6;
            case("c"):
                energiaK = kwH * 0.7;
            case("d"):
                energiaK = kwH * 0.8;
            case("e"):
                energiaK = kwH;
        }
        return energiaK;
    }
    @Override
    public String toString() {
        return "koduMasina nimi on:" + nimi +
                ", tunnis kasutab: " + kwH +" Kwh elektrit"+
                ", Masin on '" + brand + "Masin" +
                ", seletus='" + seletus;
    }
}
