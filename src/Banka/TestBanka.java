package Banka;



public class TestBanka {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Slobodan","Bojic",1988,194);
        Osoba o2= new Osoba("Strahinja","Bojic",2018,113);
        Osoba o3= new Osoba("Pera","peric",1994,1123);
        Banka banka = new Banka("Komercijalna","Vojvode Stepe 72",o2);

        BankovniRacun ZoranovRacun = new BankovniRacun(o1,1200);
        banka.dodajBnkovniRacun(ZoranovRacun);

        BankovniRacun PerinRacun = new BankovniRacun(o3,800);
        banka.dodajBnkovniRacun(PerinRacun);

        System.out.println(banka);
        banka.UkloniBankovniRacun(PerinRacun);
        System.out.println(banka);
        banka.UkloniRacun2(o1);


    }
}
