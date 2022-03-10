package Banka;


import java.util.ArrayList;

public class Banka {
    private String ime;
    private String ulica;
    private Osoba direktor;
    private ArrayList<BankovniRacun> nizbankovnihRacuna;


    public Banka(String ime, String ulica, Osoba direktor) {  ///uvek trebamo imati konstruktor koji nema arrayList
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
    }
    public Banka(String ime, String ulica, Osoba direktor,ArrayList<BankovniRacun>nizbankovnihRacuna) {
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
        this.nizbankovnihRacuna = new ArrayList<BankovniRacun>();
        public Banka(String ime,String ulica ,Osoba direktor,ArrayList<Bankovniracun>nizbankovnihracuna)
        this.nizbankovnihracuna = new ArrayList<Bankovniracun>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Osoba getDirektor() {
        return direktor;
    }

    public void setDirektor(Osoba direktor) {
        this.direktor = direktor;
    }

    public ArrayList<BankovniRacun> getNizbankovnihRacuna() {
        return nizbankovnihRacuna;
    }

    public void setNizbankovnihRacuna(ArrayList<BankovniRacun> nizbankovnihRacuna) {
        this.nizbankovnihRacuna = nizbankovnihRacuna;
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Ime banke je: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Banka se nalazi u ulici");
        sb.append(ulica);
        sb.append("\n");

        sb.append("Direktor banke je: ");
        sb.append(direktor.getIme());
        sb.append(" ");
        sb.append(direktor.getPrezime());
        sb.append("\n");


        sb.append("U ovoj banci postoje sledeci racuni");
        sb.append("\n");

        for (BankovniRacun racun : nizbankovnihRacuna){
            sb.append(racun.toString());     //oticice se u prvi dodat racun i pozvace se ispis toString
            sb.append("\n");                  //iz Bankovni racun
        }
        return sb.toString();


    }
   public void dodajBnkovniRacun (BankovniRacun b){   //dodajemo bankovni racun u niz public void bankovniRacun (bankovniracun b){
        //nizbankovnihracuna.add(b); }

        nizbankovnihRacuna.add(b);
   }

   public void UkloniBankovniRacun(BankovniRacun b){   //metoda za uklanjanjae racuna kada korisnik kaze koji bankovni racun
        nizbankovnihRacuna.remove(b);

   }
   public void UkloniBankovniRacun (Osoba o) {
       BankovniRacun bankovniracunoveOsobe = null;         //pravimo premenjivu slozzenog tipa
       for (BankovniRacun br : nizbankovnihRacuna) {    //prolazimo kroz br
           Osoba vlasnikovogRacuna = br.getVlasnik();  //dohvatimo  za svaki banRacun , dohvatimo vlasnika
           if (vlasnikovogRacuna.equals(o)) {          //da li je taj vlasnik racuna ista ona osoba koja je prosledjena (osoba o) koju zelimo da uklonimo
               bankovniracunoveOsobe = br;           // ako jeste  bankovni racun je ovo br koji sam gledao
               break;                                //kada sam nasao taj racun mogu da izadjem iz for petlje
           }
       }
       if (bankovniracunoveOsobe == null) {
           System.out.println(o.getIme()+"  "+o.getPrezime() +"ova osoba nema bankovni racun u banci");
       } else {
           nizbankovnihRacuna.remove(bankovniracunoveOsobe);
       }
   }
   public void UkloniRacun2 (Osoba o) {
     //BankovniRacun bankovniracunoveOsobe = null;
       boolean imaRacun = false;
       for (BankovniRacun i : nizbankovnihRacuna){
           // Osoba  vlasnikovogRacuna = i.getVlasnik();
           if(i.getVlasnik().equals(o)){
               nizbankovnihRacuna.remove(i);
               imaRacun= true;
               break;
           }
       }
       if(imaRacun == false){
           System.out.println(o.getIme()+"  "+o.getPrezime() +"ova osoba nema bankovni racun u banci");
       }
   }
}
