public class Main {
    public static void main(String[] args) {

        veeKasutaja Series4 = new veeKasutaja("A","Series 4","Bosch",2.25,18.5);
        koduMasin pliit = new koduMasin("C","GE pliit","General Electric",1.5);

        System.out.println(pliit.elektriKasutus());
        System.out.println(Series4.elektriKasutus());

        System.out.println(pliit);
        System.out.println(Series4);

        //Peab tegema niimoodi, et see tegelikult küsib kasutaja käest mis asju ta tahaks lisada või vaadata.
    }

}