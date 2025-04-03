import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Tuba> toad = new ArrayList<>();

        Scanner lugeja = new Scanner(System.in);
        boolean esimeneKord = true;
        boolean alusta = true;

        System.out.println("See programm salvestab teie ruumides olevad seadmed selleks,");
        System.out.println("et nendest oleks võimalikult mugav ülevaadet pidada.");

        while (alusta){
            if (esimeneKord) {
                System.out.println("");
                System.out.println("Vali tegevus:");
                System.out.println("1. Lisa tuba");
                System.out.println("2. Lisa seade");
                System.out.println("3. Eemalda tuba");
                System.out.println("4. Eemalda seade");
                System.out.println("5. Näita kõiki tube");
                System.out.println("6. Näita kõiki tube koos seadmetega");
                System.out.println("7. Näita uuesti tegevusi");
                System.out.println("8. Lõpeta programm");

                esimeneKord = false;
            }
            int valik = lugeja.nextInt();

            //Lisa tuba
            if (valik == 1){
                String toa_nimi = "";
                boolean kas_käib = true;

                System.out.println("");
                System.out.println("Kuidas soovid tuba nimetada?");

                while (kas_käib){
                    toa_nimi = lugeja.nextLine();
                    if (!toa_nimi.equals("")){
                        kas_käib = false;
                    }
                }
                Tuba uus_tuba = new Tuba(toa_nimi);
                toad.add(uus_tuba);
                System.out.println("Tehtud!");
                System.out.println("");
                System.out.println("Vali tegevus:");
            }

            //Lisa seade
            else if (valik == 2) {
                if (toad.size() == 0){
                    System.out.println("");
                    System.out.println("Kõigepealt tuleb mõni tuba lisada");
                    System.out.println("");
                }

                else {
                    String sisend = "";
                    boolean kas_käib = true;
                    int loendur;
                    int mitmes_tuba = -1;

                    System.out.println("");
                    System.out.println("Energiaefektiivsuse tähiseks on tähed A-st E-ni, energiakasutuse ja veemahutavuse kohta on oodatud komaga arv.");
                    System.out.println("Veemahutavus sisestage ainult juhul, kui on tegemist on vett mahutava seadmega.");
                    System.out.println("");
                    System.out.println("Sisesta andmed kujul: nimetus, tootja, energiaefektiivsuse tähis, energia kasutus (kilovatt-tund), veemahutavus (liiter)");

                    while (kas_käib) {
                        sisend = lugeja.nextLine();
                        if (!sisend.equals("")) {
                            kas_käib = false;
                        }
                    }

                    String[] osad = sisend.split(", ");
                    if (osad.length == 4) {
                        Kodumasin uus_seade = new Kodumasin(osad[0], osad[1], osad[2], Double.parseDouble(osad[3]));

                        System.out.println("");
                        System.out.println("Sisesta vastav number, kuhu tuppa seade lisada:");

                        for (loendur = 1; loendur < toad.size() + 1; loendur++) {
                            System.out.println(loendur + " -> " + toad.get(loendur - 1));
                        }

                        while (mitmes_tuba < 1) {
                            mitmes_tuba = lugeja.nextInt();
                        }

                        Tuba kuhu_lisada = toad.get(mitmes_tuba - 1);
                        kuhu_lisada.lisaMasin(uus_seade);

                    } else {
                        Veekasutaja uus_seade = new Veekasutaja(osad[0], osad[1], osad[2], Double.parseDouble(osad[3]), Double.parseDouble(osad[4]));

                        System.out.println("");
                        System.out.println("Sisesta vastav number, kuhu tuppa seade lisada:");

                        for (loendur = 1; loendur < toad.size() + 1; loendur++) {
                            System.out.println(loendur + " -> " + toad.get(loendur - 1));
                        }

                        while (mitmes_tuba < 1) {
                            mitmes_tuba = lugeja.nextInt();
                        }

                        Tuba kuhu_lisada = toad.get(mitmes_tuba - 1);
                        kuhu_lisada.lisaMasin(uus_seade);

                    }

                    System.out.println("Tehtud!");
                    System.out.println("");

                }
                System.out.println("Vali tegevus:");
            }

            //Eemalda tuba
            else if (valik == 3){
                if (toad.size() == 0){
                    System.out.println("");
                    System.out.println("Kõigepealt tuleb mõni tuba lisada");
                    System.out.println("");
                }

                else {
                    int loendur;
                    int mitmes_tuba = -1;

                    System.out.println("");
                    System.out.println("Sisesta vastav number, milline tuba eemaldada:");

                    for (loendur = 1; loendur < toad.size() + 1; loendur++) {
                        System.out.println(loendur + " -> " + toad.get(loendur - 1));
                    }

                    while (mitmes_tuba < 1) {
                        mitmes_tuba = lugeja.nextInt();
                    }

                    toad.remove(mitmes_tuba - 1);

                    System.out.println("Tehtud!");
                    System.out.println("");
                }

                System.out.println("Vali tegevus:");
            }

            //Eemalda seade
            else if (valik == 4){
                if (toad.size() == 0){
                    System.out.println("");
                    System.out.println("Kõigepealt tuleb mõni tuba lisada");
                    System.out.println("");
                }

                else {

                    int tuba_loendur;
                    int mitmes_tuba = -1;
                    int mitmes_seade = -1;

                    System.out.println("");
                    System.out.println("Sisesta vastav number, millisest toast soovite seadet eemaldada:");

                    for (tuba_loendur = 1; tuba_loendur < toad.size() + 1; tuba_loendur++) {
                        System.out.println(tuba_loendur + " -> " + toad.get(tuba_loendur - 1));
                    }

                    while (mitmes_tuba < 1) {
                        mitmes_tuba = lugeja.nextInt();
                    }

                    Tuba milline_tuba = toad.get(mitmes_tuba - 1);

                    System.out.println("");
                    System.out.println("Sisesta vastav number, milline seade eemaldada:");

                    milline_tuba.välastaMasinad();

                    while (mitmes_seade < 1) {
                        mitmes_seade = lugeja.nextInt();
                    }

                    milline_tuba.eemaldaMasin(mitmes_seade - 1);

                    System.out.println("Tehtud!");
                    System.out.println("");
                }

                System.out.println("Vali tegevus:");
            }

            //Näita kõiki tube
            else if (valik == 5){
                if (toad.size() == 0){
                    System.out.println("");
                    System.out.println("Kõigepealt tuleb mõni tuba lisada");
                }

                else{
                    System.out.println("");
                    System.out.println("Kõik preagused toad:");

                    for (int loendur = 1; loendur < toad.size() + 1; loendur++) {
                        System.out.println(loendur + " -> " + toad.get(loendur - 1));
                    }
                }

                System.out.println("");
                System.out.println("Vali tegevus:");
            }

            //Näita kõiki tube koos seadmetega
            else if (valik == 6){
                if (toad.size() == 0){
                    System.out.println("");
                    System.out.println("Kõigepealt tuleb mõni tuba lisada");
                    System.out.println("");
                }

                else{
                    System.out.println("");
                    System.out.println("Kõik preagused toad ja nendes olevad seadmed:");

                    for (Tuba tuba : toad) {
                        System.out.println("Toa nimi:");
                        System.out.println(tuba);
                        if (tuba.masinateArv() > 0){
                            System.out.println("Toa seadmed:");
                            tuba.välastaMasinad();
                        }
                        else System.out.println("Ühtegi seadet pole veel lisatud");
                        System.out.println("");
                    }
                }

                System.out.println("Vali tegevus:");
            }

            else if (valik == 7){
                esimeneKord = true;
            }

            else if (valik == 8){
                System.out.println("");
                System.out.println("Lõpetatud");

                alusta = false;
            }

            else {
                System.out.println("");
                System.out.println("Vali number 1 kuni 8 seast!");
            }

        }

    }

}
