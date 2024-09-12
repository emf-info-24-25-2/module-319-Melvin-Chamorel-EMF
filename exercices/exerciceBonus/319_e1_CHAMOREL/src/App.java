public class App {
    public static final int TEMPS_MIN = 35;
    public static final int TEMPS_MAX = 75;
    public static void main(String[] args) throws Exception {
        String[] riders = new String[] {"Killian","Max","Noé","Beat","André","Alex","John","Fred"};
        int tour = 1;
        if (riders.length <= 2) {
            genererTemps(TEMPS_MAX,TEMPS_MIN);
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
                //System.out.println(riders[i] + "[" + tabTemps[i] + "s]");
            }
            System.out.println("------------------------------------");
            tour++;
            calculQualification(null, riders);
        }else {
            System.out.println("le gagnant est : " + riders[0]);
        }

    }

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
        riders = ridersRestants;
    }
}
