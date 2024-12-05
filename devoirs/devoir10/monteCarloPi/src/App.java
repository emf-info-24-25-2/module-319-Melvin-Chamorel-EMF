public class App {
    public static final int NBRE_ESSAIS=1000000000;

    public static void main(String[] args) throws Exception {
        int compteur =  0;
        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = Math.random();
            double y = Math.random();

            double hypthenuse = Math.sqrt(x * x + y * y);

            if (hypthenuse<1) {
                compteur++;
            }

        }
        double estimation = 4*(double)compteur / NBRE_ESSAIS;
        System.out.println("pi = environ " + estimation);
    }
}
