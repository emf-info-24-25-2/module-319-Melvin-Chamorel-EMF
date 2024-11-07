import java.util.Arrays;
import java.util.Random;

public class Exercice11 {
    // Déclaration de la méthode inverseLeTableau
    public static int[] inverseLeTableau(int[] tableau) {
        int longueur = tableau.length;
        int[] tableauInverse = new int[longueur];

        for (int i = 0; i < longueur; i++) {
            tableauInverse[i] = tableau[longueur - 1 - i];
        }

        return tableauInverse;
    }

    public static void main(String[] args) {
        // Déclaration des constantes MIN et MAX
        final int MIN = 0;
        final int MAX = 100;

        // Déclaration et initialisation du tableauInitial
        int[] tableauInitial = new int[4];

        // Remplissage du tableauInitial avec des valeurs aléatoires entre MIN et MAX
        Random random = new Random();
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }

        // Affichage du contenu du tableauInitial
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        // Appel de la méthode inverseLeTableau et stockage du résultat dans tableauFinal
        int[] tableauFinal = inverseLeTableau(tableauInitial);

        // Affichage du contenu du tableauFinal
        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tableauFinal[i]);
        }
    }
}