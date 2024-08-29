package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int monAge = 16;
        boolean estMajeur;
        if (monAge >= 18) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        System.out.println("Je m'appelle CHAMOREL Melvin");
        System.out.println("Mon âge est de : " + monAge + " ans");
        if (estMajeur == true) {
            System.out.println("Je suis majeur");
        } else {
            System.out.println("Je ne suis pas encore majeur");
        }
    }
}
