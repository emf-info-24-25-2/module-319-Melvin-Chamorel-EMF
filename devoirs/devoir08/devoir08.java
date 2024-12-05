import java.util.Random;

public class devoir08 {

    private static final String[] CARACTERES = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    private static final int NBR_ESSAI = 5;
    private static final int TAILLE_MOT_DE_PASSE = 15;

    private static String genereMotDePasse(int tailleMotDePasse) {
       
        String resultat = "";

        Random random = new Random();

        while (resultat.length() < tailleMotDePasse) {
        
            int position = random.nextInt(CARACTERES.length);

            resultat += CARACTERES[position];
        }

        return resultat;
    }

    public static void main(String[] args) {
 
        for (int i = 0; i < NBR_ESSAI; i++) {
            
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);

            System.out.println("Mot de passe généré : " + motDePasse);
        }
    }
}
