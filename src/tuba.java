import java.util.ArrayList;
import java.util.List;

public class tuba {
    private List<masin> masinadToas = new ArrayList<>();

    public tuba(List<masin> masinadToas) {
        this.masinadToas = masinadToas;
    }

    public void lisaMasin(masin masin){
        masinadToas.add(masin);
    }
    public void eemaldaMasin(String masin){
        masinadToas.remove(masin);
    }

    public void välastaMasinad(){
        for(masin elem : masinadToas)
            System.out.println(elem);
    }
}
