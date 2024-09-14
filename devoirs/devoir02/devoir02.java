public class devoir02 {
public static final int CB = 3;
public static final int CA = 5;
    public static void main(String[] args) {
        int RA = 0;
        int RB = 0;
        int Remplissage = 8;
          for (Remplissage = 5; Remplissage == 0|| RA == CA; Remplissage--) {
              Remplissage --;
              RA ++;
              System.out.println("il y a " + RA + " dans le réservoir A et " + Remplissage + " restant...");
          }
          System.out.println("remplisage du prochin");
         for (Remplissage = 5;Remplissage == 0|| RB == CB; Remplissage--) {
              Remplissage --;
              RB ++;
              System.out.println("il y a " + RB + " dans le réservoir B et " + Remplissage + " restant... remplisage terminé");
         }
}
}
