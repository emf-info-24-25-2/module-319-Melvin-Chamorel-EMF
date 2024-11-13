package devoirs.devoir06;

public class devoir06{
    public static final int TAILE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args){
        int[] tableauxEntier;
        tableauxEntier = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILE_TABLEAU);
        for(int i = 0; i < tableauxEntier.length; i++){
            System.out.print(tableauxEntier[i]);
        }

        //RIF: vous devriez utiliser la valeur définie en constante
        int valeurARechercher = 0;
        int valeurTrouver = rechercheValeur(tableauxEntier, valeurARechercher);
        int valeurMax = rechercheMax(tableauxEntier);
        int valeurMin = rechercheMin(tableauxEntier);

        System.out.println("\n"+"valeur a trouver "+valeurTrouver+"\n"+"Valeur max "+valeurMax+"\n"+"Valeur min "+valeurMin);
    }
    public static int[] genereTableau(int min, int max, int taille){
        int[]tableauxEntier = new int[taille];
        for(int i = 0; i < tableauxEntier.length; i++){
            tableauxEntier[i] = (int) (Math.random() * (max - min + 1)+min);
            //RIF: le i++ est déjà dans la boucle for, ne le mettez pas encore une fois
            i++;
        }
        return tableauxEntier;
    }

    public static int rechercheMin(int[] tableaux){
        int valeurMin = 0;
        for(int i = 0; i < tableaux.length; i++){
            //RIF: si vous faites cela dans la boucle, que se passe-t-il?
            valeurMin = tableaux[0];
            if (valeurMin > tableaux[i]){
                valeurMin = tableaux[i];
            }
        }
        return valeurMin;
    }

    public static int rechercheMax(int[] tableaux){
        int valeurMax = 0;
        for(int i = 0; i < tableaux.length; i++){
            //RIF: même remarque
            valeurMax = tableaux[0];
            if (valeurMax < tableaux[i]){
                valeurMax = tableaux[i];
            }
        }
        return valeurMax;
    }

    public static int rechercheValeur(int[] tableaux, int valeurARechercher){
        int valeurTrouver = -1;
        for(int i = 0; i < tableaux.length; i++){
            if(tableaux[i] == valeurARechercher){
                //RIF: cette méthode ne doit pas retourner la valeur contenue (on la connait déjà, c'est "valeurARechercher" mais son index/ sa position
                valeurTrouver = tableaux[i];
            }
        }
        return valeurTrouver;
    }
}
