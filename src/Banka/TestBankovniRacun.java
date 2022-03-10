package Banka;


public class TestBankovniRacun {
    public static void main(String[] args) {
        Osoba o2 = new Osoba("Zoran","Milicevic",1996,189.2);
        Osoba o3 = new Osoba("Slobodan","Bojic",1988,194.2);


        BankovniRacun br1 = new BankovniRacun(o2,1000.1);
        BankovniRacun br2 = new BankovniRacun(o3);
        BankovniRacun br3 = new BankovniRacun(100);

        BankovniRacun br4 = new BankovniRacun (o3,100) ;

       // br2.isplata(100);
        //System.out.println(br2);
        //br1.uplata(1000);
        //System.out.println(br1);
        System.out.println(br4);
    }
}
