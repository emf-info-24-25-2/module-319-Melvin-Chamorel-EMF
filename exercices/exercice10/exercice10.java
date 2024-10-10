package exercices.exercice10;
public class Methodes {
    public class BonjourMethod {
        public static void direBonjour() {
            System.out.println("Bonjour");
        }
        public static void main(String[] args) {
            direBonjour();
        }
    }
    public class DireQuelqueChose {
        public static void dire(String message) {
            System.out.println(message);
        }
    
        public static void main(String[] args) {
            String texte = "N'importe quoi";
            dire(texte);
        }
    }
    public class ExempleMath {
        public static void main(String[] args) {
            double a = 5.2;
            double b = 3.9;
            double minimum = Math.min(a, b);
            System.out.println("Le plus petit nombre entre " + a + " et " + b + " est : " + minimum);
            double maximum = Math.max(a, b);
            System.out.println("Le plus grand nombre entre " + a + " et " + b + " est : " + maximum);
            double puissance = Math.pow(2, 3);
            System.out.println("2 élevé à la puissance 3 est : " + puissance);
            double racineCarree = Math.sqrt(25);
            System.out.println("La racine carrée de 25 est : " + racineCarree);
            double valeurAbsolue = Math.abs(-7.5);
            System.out.println("La valeur absolue de -7.5 est : " + valeurAbsolue);
        }
    }
        int[] tableau = creerTableau(50);
        System.out.println("Le tableau a une taille de " + tableau.length + " cellules.\n");

        System.out.println("Contenu du tableau aléatoire :");
        remplirTableauAleatoire(tableau);
        afficherTableau(tableau);

        int minimum = trouverMinimum(tableau);
        int maximum = trouverMaximum(tableau);

        System.out.println("\nLa valeur min trouvée = " + minimum);
        System.out.println("La valeur max trouvée = " + maximum);

        remplacerValeur(tableau, 12, 5);
        System.out.println("\nAprès remplacement de la valeur 12 par la valeur 5, voici le contenu du tableau :");
        afficherTableau(tableau);

        int somme = calculerSomme(tableau);
        double moyenne = calculerMoyenne(tableau);

        System.out.println("\nLa somme des cellules du tableau = " + somme);
        System.out.println("La moyenne des cellules du tableau = " + moyenne);

        int valeurRecherchee = 13;
        int premiereOccurrence = trouverPremiereOccurrence(tableau, valeurRecherchee);
        int derniereOccurrence = trouverDerniereOccurrence(tableau, valeurRecherchee);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la 1ère position N°" + (premiereOccurrence + 1));
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la dernière position N°" + (derniereOccurrence + 1));
    }
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }
    public static void remplirTableauAvecValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
    }
    public static void remplirTableauAleatoire(int[] tableau) {
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(20) + 1;
        }
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }
    public static int trouverMinimum(int[] tableau) {
        int minimum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < minimum) {
                minimum = tableau[i];
            }
        }
        return minimum;
    }
    public static int trouverMaximum(int[] tableau) {
        int maximum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }
        return maximum;
    }
    public static int compterOccurences(int[] tableau, int valeur) {
        int compteur = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                compteur++;
            }
        }
        return compteur;
    }
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }
    public static double calculerMoyenne(int[] tableau) {
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }
    public static void remplacerValeur(int[] tableau, int valeurRecherchee, int valeurRemplacement) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                tableau[i] = valeurRemplacement;
            }
        }
    }
    public static int trouverPremiereOccurrence(int[] tableau, int valeurRecherchee) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i;
            }
        }
        return -1;
    }
    public static int trouverDerniereOccurrence(int[] tableau, int valeurRecherchee) {
        int derniereOccurrence = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                derniereOccurrence = i;
            }
        }
        return derniereOccurrence;
    }
