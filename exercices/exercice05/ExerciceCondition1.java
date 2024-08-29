package exercices.exercice05;

public class ExerciceCondition1 {
public static void main(String[] args) {
    int X = 26;
    String P1 = "a";

    if (X < 0) {
        P1 = "negatif";
    }
    if (X >= 0) {
        P1 = "positif";
    }
        System.out.println("le chifre est " + P1);

}

}
