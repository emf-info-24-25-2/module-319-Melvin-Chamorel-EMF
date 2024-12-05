public class devoir09 {

    private static final int NBRE_CHIFFRES = 6;
    private static final int MIN = 0;
    private static final int MAX = 42;

    public static int[] genereTirage(int nombreChiffres, int min, int max) {
        if (nombreChiffres < 1 || min > max || (max - min + 1) < nombreChiffres) {
            System.out.println("Paramètres invalides pour le tirage.");
            return null;
        }

        int[] tirage = new int[nombreChiffres];
        boolean[] dejaUtilise = new boolean[max - min + 1];

        for (int i = 0; i < nombreChiffres; i++) {
            int chiffre;
            do {
                chiffre = (int) (Math.random() * (max - min + 1)) + min;
            } while (dejaUtilise[chiffre - min]);
            tirage[i] = chiffre;
            dejaUtilise[chiffre - min] = true;
        }

        return tirage;
    }

    public static void afficheTirage(int[] tirage) {
        System.out.println("Tirage du loto :");
        for (int chiffre : tirage) {
            System.out.println(chiffre);
        }
    }

    public static void main(String[] args) {
        int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);
        if (tirage != null) {
            afficheTirage(tirage);
        }
    }
}
