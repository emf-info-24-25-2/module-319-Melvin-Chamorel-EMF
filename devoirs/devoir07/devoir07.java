import java.util.Arrays;
import java.util.Random;

public class Devoir07 {

    // Constantes
    private static final int TAILLE_TABLEAU = 10;
    private static final int MIN_NOMBRE = -8;
    private static final int MAX_NOMBRE = 8;
    private static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        System.out.println("Devoir 07 du module 319");
        System.out.println("---------------------------------------");

        // Génération du tableau de nombres aléatoires
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        // Recherche de la position de la valeur recherchée
        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        // Affichage des informations
        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");
        System.out.println("Les deux premières/dernières valeurs sont : [" + tableau[0] + "][" + tableau[1] +
                "] ... [" + tableau[TAILLE_TABLEAU - 2] + "][" + tableau[TAILLE_TABLEAU - 1] + "]");
        System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + (position + 1) +
                " du tableau !");
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }

    // Méthode pour générer des valeurs aléatoires dans un tableau
    private static int[] genererValeursAleatoires(int taille, int min, int max) {
        Random rand = new Random();
        int[] tableau = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableau[i] = rand.nextInt((max - min) + 1) + min;
        }
        return tableau;
    }

    // Méthode pour trouver la position d'une valeur dans un tableau
    private static int positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }
}