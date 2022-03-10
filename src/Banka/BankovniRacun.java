package Banka;



public class BankovniRacun {

   private Osoba vlasnik;
   private double  stanjeNaRacunu;

   public BankovniRacun(double stanjeNaRacunu) {
      this.stanjeNaRacunu = stanjeNaRacunu;
   }

   public BankovniRacun(Osoba vlasnik, double stanjeNaRacunu) {
      this.vlasnik = vlasnik;
      this.stanjeNaRacunu = stanjeNaRacunu;
   }

   public Osoba getVlasnik() {
      return vlasnik;
   }

   public void setVlasnik(Osoba vlasnik) {
      this.vlasnik = vlasnik;
   }

   public double getStanjeNaRacunu() {
      return stanjeNaRacunu;
   }

   public void setStanjeNaRacunu(double stanjeNaRacunu) {
      this.stanjeNaRacunu = stanjeNaRacunu;
   }

   public BankovniRacun(Osoba vlasnik) {
      this.vlasnik = vlasnik;

   }

   public void uplata(double iznos){
      stanjeNaRacunu = stanjeNaRacunu + iznos ;

   }
   public void isplata (double iznos){
      if (iznos > stanjeNaRacunu){
         System.out.println("Nemate dovoljno sredstava");
      }
      else {
         stanjeNaRacunu = stanjeNaRacunu - iznos;
      }
   }
   public String toString(){
      StringBuilder sb = new StringBuilder ();
     if (vlasnik != null) {
        sb.append("vlasnik racuna je ");
        sb.append(vlasnik.getIme());   //getujemo ime iz druge klase
        sb.append(" ");
        sb.append(vlasnik.getPrezime());
        sb.append("\n");
     }
     else{
        sb.append("Racun nema vlasnika");
     }
      sb.append("Stanje na racunu je: ");
      sb.append(stanjeNaRacunu);
      sb.append("\n");

      return sb.toString();
   }
}
