import java.util.ArrayList;
import java.util.List;

public class Tuba {
    private List<Masin> masinadToas = new ArrayList<>();
    private String nimi;
    public Tuba(String nimi) {
        this.nimi = nimi;
        this.masinadToas = masinadToas;
    }

    public void lisaMasin(Masin masin){
        masinadToas.add(masin);
    }
    public void eemaldaMasin(int mitmes_seade){
        masinadToas.remove(mitmes_seade);
    }

    public void välastaMasinad() {
        for (int loendur = 1; loendur < masinadToas.size() + 1; loendur++) {
            System.out.println(loendur + " -> " + masinadToas.get(loendur - 1));
        }


    }
    public int masinateArv(){
        return masinadToas.size();
    }

    @Override
    public String toString() {
        return nimi;
    }
}
