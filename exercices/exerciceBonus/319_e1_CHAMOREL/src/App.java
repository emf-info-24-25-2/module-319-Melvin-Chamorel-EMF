public class App {
    public static final int TEMPS_MIN = 35;
    public static final int TEMPS_MAX = 75;
    public static void main(String[] args) throws Exception {
        String[] riders = new String[] {"Killian","Max","Noé","Beat","André","Alex","John","Fred"};
        int tour = 1;
        //ici la donnée dit "tant que" (pt 6.3), c'est une indice qu'il faut utiliser while, plutot que if
        //une taille d'au moins 2, c'est >=2, pas <=
        if (riders.length <= 2) {
            genererTemps(TEMPS_MAX,TEMPS_MIN);//ici, il faut mettre ce résultat dans une variable, sinon il disparait. donc int[] tabTemps=genererTemps...
            switch (tour) {
                case 1:
                System.out.println("Résultat du quart de finale :");
                    break;
                case 2:
                System.out.println("Résultat de la demi-finale :");
                    break;
                case 3:
                System.out.println("Résultat de la finale :");
                    break;
                default:
                System.out.println("ERROR");
                    break;
            }
            for (int i = 0; i < riders.length; i++) {
                //pour ne pas avoir de retour à la ligne entre les riders, il faut utiliser print plutot que println
                //System.out.println(riders[i] + "[" + tabTemps[i] + "s]");
            }
            System.out.println("------------------------------------");
            tour++;
            calculQualification(null, riders);//ici vous auriez riders=calculQualification...
        }else {
            System.out.println("le gagnant est : " + riders[0]);
        }

    }

    //pt3, la méthode genererTemps doit recevoir la taille du tableau en paramètre
    //par exemple si j'appelle genererTableau(3), ça va créer un tableau de taille 3, et genererTableau(245) va en créer un de taille 245
    //pas besoin de passer les constantes en paramètres, elles sont accessibles dans la classe
    public static int[] genererTemps(int TEMPS_MAX, int TEMPS_MIN) {
        int[] tabTemps = new int[8];
        for (int i = 0; i < tabTemps.length; i++) {
            int random = (int) (Math.random() * (TEMPS_MAX - TEMPS_MIN + 1)) + TEMPS_MIN;
            tabTemps [i] = random;
        }
        return tabTemps;
    } 

    public static int positionMeilleurTemps(int[] tabTemps) {
        int meilleurTemps = 0;
        int index = 0;
        for (int i = 0; i < tabTemps.length; i++) {
            //attention, votre méthode trouve le temps le plus grand, qui est en fait, le plus mauvais
            if (meilleurTemps > tabTemps[i]) {
                meilleurTemps = tabTemps[i];
                index = i;
            }
        }
        return index;
    }

    public static void calculQualification(int[] tabTemps, String[] riders) {
        String[] ridersRestants = new String[riders.length / 2];
        for (int i = 0; i < ridersRestants.length; i++) {
            ridersRestants[i] = riders[positionMeilleurTemps(tabTemps)];
            tabTemps[positionMeilleurTemps(tabTemps)] = Integer.MAX_VALUE;
        }
        riders = ridersRestants; //cette étape ne se fait pas ici, ce n'est pas demandé dans la donnée
    }
}
