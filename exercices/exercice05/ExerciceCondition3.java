package exercices.exercice05;

public class ExerciceCondition3 {
    public static void main(String[] args) {
        String P = "a";
        int X = 1;
        int Y = 2;
        int Z = 1;
        Z = X * Y;
        if (Z<0) {
            P = "negatif";
        }
        if (Z>=0) {
            P = "positif";
        }
        System.out.println("le resultat de " + X + " * " + Y + " est " + P);
    }
}
